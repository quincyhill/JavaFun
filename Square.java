import java.lang.Math;

public class Square implements Measurable, Capable {
    private double length;

    Square(double length) {
        this.length = length;
    }

    public void changeLength(double length) {
        this.length = length;
    }

    public void hear() {
        System.out.println("This is the hear function");
    }

    public void respond() {
        System.out.println("This is the respond function");
    }

    public double getPerimeter() {
        return (4 * this.length);
    }

    public double getArea() {
        return Math.pow(this.length, 2);
    }

    public double getLength() {
        return this.length;
    }
}