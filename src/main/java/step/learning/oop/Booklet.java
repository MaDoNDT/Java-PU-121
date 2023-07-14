package step.learning.oop;

public class Booklet extends Literature implements Copyable{
    private String publisher;

    public Booklet(String title, String publisher) {
        super.setTitle(title);
        this.setPublisher(publisher);
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String getCard() {
        return String.format("Booklet: %s, publisher: %s.", this.getTitle(), this.getPublisher());
    }
}
