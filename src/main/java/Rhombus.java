// Student Name: Sk Navid Akram
// Student ID: 3144286

// A rhombus shape defined by its diagonals
public class Rhombus extends Shape {
    private double diagonal1;
    private double diagonal2;

    public Rhombus(String name, double diagonal1, double diagonal2) {
        super(name);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    // Area = (d1 * d2) / 2
    @Override
    public double area() {
        return (diagonal1 * diagonal2) / 2;
    }

    // Perimeter = 4 * side length, where side = sqrt((d1/2)² + (d2/2)²)
    @Override
    public double perimeter() {
        double side = Math.sqrt(Math.pow(diagonal1/2, 2) + Math.pow(diagonal2/2, 2));
        return 4 * side;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    @Override
    public String toString() {
        return super.toString() + ", Diagonal1: " + diagonal1 + ", Diagonal2: " + diagonal2;
    }
} 