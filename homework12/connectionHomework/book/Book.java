package endTermHomeWork.homework12.connectionHomework.book;

public class Book {
    private int number;
    private String name;
    private double prince;
    private String press;

    public Book() {
    }

    public Book( String name,int number, double prince, String press) {
        this.number = number;
        this.name = name;
        this.prince = prince;
        this.press = press;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrince() {
        return prince;
    }

    public void setPrince(double prince) {
        this.prince = prince;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }
}
