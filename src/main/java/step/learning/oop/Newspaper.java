package step.learning.oop;

//import java.text.SimpleDateFormat;
//import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.time.LocalDate;

public class Newspaper extends Literature implements Periodic{
    //private Date date;
    private LocalDate date;
    //private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public Newspaper(String title, LocalDate date) {
        super.setTitle(title);
        this.setDate(date);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String getCard() {
        return String.format("Newspaper: %s, date: %s.", this.getTitle(), this.getDate());
    }
    public String getPeriod() {
        return "daily";
    }
}
