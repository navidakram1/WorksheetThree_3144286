package com.worksheet;

// Student Name: Sk Navid Akram
// Student ID: 3144286

/**
 * Abstract class representing a geometric shape
 * This class provides the base structure for all shapes in the system
 */
public abstract class Shape {
    private String name;  // Name of the shape

    /**
     * Constructor to initialize the shape with a name
     * @param name The name of the shape
     */
    public Shape(String name) {
        this.name = name;
    }

    /**
     * Get the name of the shape
     * @return The shape's name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the shape
     * @param name The new name for the shape
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Calculate the area of the shape
     * @return The area as a double value
     */
    public abstract double area();

    /**
     * Calculate the perimeter of the shape
     * @return The perimeter as a double value
     */
    public abstract double perimeter();

    /**
     * String representation of the shape
     * @return A string containing the shape's name
     */
    @Override
    public String toString() {
        return "Shape: " + name;
    }
} 