package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Place{

    private List<String> nowPlaying;

    public Theater(String name, int priceCategory) {
        super(name, priceCategory);
        this.nowPlaying = new ArrayList<>();
    }

    public void addMovie(String movieTitle) {
        if (!this.nowPlaying.contains(movieTitle)) {
            this.nowPlaying.add(movieTitle);
        }
    }

    public void removeMovie(String movieTitle) {
        this.nowPlaying.remove(movieTitle);
    }

    @Override
    public String toString() {
        StringBuilder dollarSigns = new StringBuilder();
        for (int i = 0; i < this.getPriceCategory(); i++) {
            dollarSigns.append("$");
        }
        return String.format("Theater { name: \"%s\", stars: %.1f, priceCategory: \"%s\", nowPlaying: \"%s\" }", this.getName(), this.getStars(), dollarSigns, this.getNowPlayingList());
    }

    // Getters and Setters
    public List<String> getNowPlayingList() {
        return nowPlaying;
    }

}

