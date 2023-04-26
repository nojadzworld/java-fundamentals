package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {


    @Test
    public void testConstructor() {
        Place place = new Place("Test Place", 3);
        assertEquals("Test Place", place.getName());
        assertEquals(3, place.getPriceCategory());
        assertEquals(0.0, place.getAverageRating());
    }


    @Test
    public void testAddReview() {
        Place place = new Place("Test Place", 3);
        Review review = new Review("John Doe", "This place was great!", 4, place);
        place.addReview(review);
        assertEquals(1, place.getReviews().size());
        assertEquals(review, place.getReviews().get(0));
        assertEquals(4.0, place.getAverageRating());
    }

    @Test
    public void testAddReviewWithExistingAuthor() {
        Place place = new Place("Test Place", 3);
        Review review1 = new Review("John Doe", "This place was great!", 4, place);
        Review review2 = new Review("John Doe", "This place was terrible!", 1, place);
        place.addReview(review1);
        place.addReview(review2);
        assertEquals(1, place.getReviews().size());
        assertEquals(review1, place.getReviews().get(0));
        assertEquals(4.0, place.getAverageRating());
    }

    @Test
    public void testAddMultipleReviews() {
        Place place = new Place("Test Place", 3);
        Review review1 = new Review("John Doe", "This place was great!", 4, place);
        Review review2 = new Review("Jane Smith", "This place was okay.", 3, place);
        place.addReview(review1);
        place.addReview(review2);
        assertEquals(2, place.getReviews().size());
        assertEquals(review1, place.getReviews().get(0));
        assertEquals(review2, place.getReviews().get(1));
        assertEquals(3.5, place.getAverageRating());
    }

    @Test
    public void testToString() {
        Place place = new Place("Test Place", 3);
        Review review = new Review("John Doe", "This place was great!", 4, place);
        place.addReview(review);
        String expected = "Restaurant Test Place has 1 reviews, with an average rating of 4.0";
        assertEquals(expected, place.toString());
    }
}