package step.learning.oop;

public class Journal extends Literature{
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
}
