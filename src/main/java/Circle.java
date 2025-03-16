package com.worksheet;

// Student Name: Sk Navid Akram
// Student ID: 3144286

/** Circle implementation with area and perimeter calculations */
public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    // Area = πr²
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Perimeter = 2πr
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