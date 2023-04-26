package inheritance;

public class Review {
    private final String body;
    private final String author;
    private final int stars;
    private String movie;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.movie = null;
    }

    public Review(String body, String author, int stars, String movie) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.movie = movie;
    }


    public String toString() {
 return "Review by " + author + " for " + place.getName() + "\n" + body + "\n" + stars + " stars";
    }

    public String getBody() {
        return body;
    }



    public String getAuthor() {
        return author;
    }



    public int getStars() {
        return stars;
    }





}
