// Student Name: Sk Navid Akram
// Student ID: 3144286

// A circle shape that can calculate its area and perimeter
public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    // πr²
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // 2πr (circumference)
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius;
    }
} 