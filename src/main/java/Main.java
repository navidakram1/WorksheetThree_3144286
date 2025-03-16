package com.worksheet;

// Student Name: Sk Navid Akram
// Student ID: 3144286

import java.util.ArrayList;
import com.worksheet.Shape;
import com.worksheet.Circle;
import com.worksheet.Rhombus;
import com.worksheet.RightAngledTriangle;

// Main class to demonstrate shape calculations
public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store shapes
        ArrayList<Shape> shapes = new ArrayList<>();

        // Add two of each shape
        shapes.add(new Circle("Circle 1", 5.0));
        shapes.add(new Circle("Circle 2", 3.0));
        
        shapes.add(new Rhombus("Rhombus 1", 6.0, 8.0));
        shapes.add(new Rhombus("Rhombus 2", 4.0, 6.0));
        
        shapes.add(new RightAngledTriangle("Triangle 1", 3.0, 4.0));
        shapes.add(new RightAngledTriangle("Triangle 2", 5.0, 12.0));

        // Print information for each shape
        System.out.println("Shape Calculations:");
        System.out.println("------------------");
        
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.printf("Area: %.2f\n", shape.area());
            System.out.printf("Perimeter: %.2f\n", shape.perimeter());
            System.out.println("------------------");
        }
    }
}