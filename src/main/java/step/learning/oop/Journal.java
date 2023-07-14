package step.learning.oop;

public class Journal extends Literature implements Copyable, Periodic{
    private int number;

    public Journal(String title, int number) {
        super.setTitle(title);
        this.setNumber(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String getCard() {
        return String.format("Journal: %s, number: %d.", this.getTitle(), this.getNumber());
    }
    public String getPeriod() {
        return "monthly";
    }
}
