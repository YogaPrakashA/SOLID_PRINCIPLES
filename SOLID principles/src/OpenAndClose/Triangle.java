package OpenAndClose;

public class Triangle implements Shape {

    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public Triangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Triangle() {
    }

    @Override
    public String calculateArea() {
        return "Calculation of triangle : " + length * breadth;
    }
}
