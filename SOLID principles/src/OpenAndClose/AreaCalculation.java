package OpenAndClose;

public class AreaCalculation {
    /*
     *   violation of Open/closed Principle
     * */
    public double calculateArea(String shape, double radius, double length, double breadth) {
        if (shape.equalsIgnoreCase("Circle"))
            return Math.PI * radius * radius;
        else if (shape.equalsIgnoreCase("triangle"))
            return length * breadth;
        else
            return 0.0;

    }
}
