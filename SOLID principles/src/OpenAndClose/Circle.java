package OpenAndClose;

public class Circle implements Shape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public String calculateArea() {
        return "Calculation Of Circle : " + Math.PI * radius * radius;
    }
}
