package OOPS;

class Pen {
    String color;
    int tip;

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void printColor() {
        System.out.println("Color is: " + color);
    }

    public void setTip(int newTip) {
        this.tip = newTip;
    }

}

public class oop {

    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.setColor("blue");
        pen.printColor();

        pen.setTip(5);

        System.out.println(pen.color);
        System.out.println(pen.tip);
    }

}
