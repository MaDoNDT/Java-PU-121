package step.learning.oop;

public class Book extends Literature implements Copyable{
    private String author;

    public Book(String title, String author) {
        super.setTitle(title);
        this.setAuthor(author);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCard() {
        return String.format("Book: %s, author: %s.", this.getTitle(), this.getAuthor());
    }
}

/*
ООП-1: Додати до сутностей проєкту
Booklet (Title, Publisher)
Доповнити UML діаграму, описати клас, його аксесори та конструктор(и)
 */
