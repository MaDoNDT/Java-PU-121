package step.learning.oop;

import java.util.Date;

public class Newspaper extends Literature{
    private Date date;

    public Newspaper(String title, Date date) {
        super.setTitle(title);
        this.setDate(date);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
