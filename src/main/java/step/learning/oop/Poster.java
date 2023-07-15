package step.learning.oop;

public class Poster extends Literature implements Copyable, Expo{
    private String artist;

    public Poster(String title, String artist) {
        super.setTitle(title);
        this.setArtist(artist);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String getCard() {
        return String.format("Poster: %s, artist: %s.", this.getTitle(), this.getArtist());
    }
}
