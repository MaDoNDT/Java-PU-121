package step.learning.oop;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Hologram extends Literature implements Expo{
    private LocalDate date;
    //private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public Hologram(String title, LocalDate date) {
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
        return String.format("Hologram: %s, date: %s.", this.getTitle(), this.getDate());
    }
}
