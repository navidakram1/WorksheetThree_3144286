package com.worksheet;

// Student Name: Sk Navid Akram
// Student ID: 3144286

// A right-angled triangle defined by its base and height
public class RightAngledTriangle extends Shape {
    private double base;
    private double height;

    public RightAngledTriangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    // Area = (base * height) / 2
    @Override
    public double area() {
        return (base * height) / 2;
    }

    // Perimeter = base + height + hypotenuse
    // where hypotenuse = sqrt(base² + height²)
    @Override
    public double perimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + ", Base: " + base + ", Height: " + height;
    }
} 