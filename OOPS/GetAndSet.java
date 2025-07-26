package OOPS;

public class GetAndSet {

    public static void main(String[] args) {
        Pen2 p1 = new Pen2();
        p1.setColor("Blue");

        System.out.println(p1.getColor());

        // set tip
        p1.setTip(5);

        System.out.println(p1.getTip());

    }

}

class Pen2 {
    private String color;
    private int tip;

    // getter for pen color
    String getColor() {
        return this.color;
    }

    // setter for pen color
    void setColor(String color) {
        this.color = color;
    }

    // getter for pen tip
    int getTip() {
        return this.tip;
    }

    // setter for pen tip
    void setTip(int tip) {
        this.tip = tip;
    }
}