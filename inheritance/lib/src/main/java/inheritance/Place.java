package inheritance;

import java.util.*;


public class Place {
    private String name;
    private List<Review> reviews;
    private Map<String, Review> reviewMap;
    private double averageRating;
    private int stars;
    protected int priceCategory;

    public Place(String name, int priceCategory) {
        this.name = name;
        if (priceCategory < 0 || priceCategory > 5) {
            throw new IllegalArgumentException("Price category must be in between 0 and 5");
        }
        this.reviews = new ArrayList<>();
        this.reviewMap = new HashMap<>();
        this.averageRating = 0.0;
        this.stars = stars;
        this.priceCategory = priceCategory;
    }

    public int getStars() {
        return stars;
    }


    public int getPriceCategory() {
        return priceCategory;
    }


    public String getName() {
        return name;

    }

    public List<Review> getReviews() {
        return reviews;
    }


    public void addReview(Review review) {
        if(reviewMap.containsKey(review.getAuthor())) {
            System.out.println("This review has already been posted for this restaurant");
            return;
        }

        reviews.add(review);
        reviewMap.put(review.getAuthor(), review);
        calculateAverageRating();

    }

    private void calculateAverageRating() {
        if (reviews.isEmpty()) {
            this.averageRating = 0.0;
            return;
        }
        double sum = 0.0;
        for (Review review : reviews) {
            sum += review.getStars();
        }

        this.averageRating = sum / reviews.size();
    }

    public double getAverageRating() {
        return averageRating;
    }
    public String toString() {
        return "Restaurant " + name + " has " + reviews.size() + " reviews, with an average rating of " + averageRating;
    }


}
