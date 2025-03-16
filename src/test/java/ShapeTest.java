// Student Name: Sk Navid Akram
// Student ID: 3144286

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for Shape and its subclasses
 */
public class ShapeTest {
    private static final double EPSILON = 0.001;  // For floating point comparisons

    // Circle Tests
    @Test
    public void testCircleArea() {
        Circle circle = new Circle("Test Circle", 5.0);
        assertEquals(78.539, circle.area(), EPSILON);
    }

    @Test
    public void testCirclePerimeter() {
        Circle circle = new Circle("Test Circle", 5.0);
        assertEquals(31.415, circle.perimeter(), EPSILON);
    }

    @Test
    public void testCircleToString() {
        Circle circle = new Circle("Test Circle", 5.0);
        assertEquals("Shape: Test Circle, Radius: 5.0", circle.toString());
    }

    // Rhombus Tests
    @Test
    public void testRhombusArea() {
        Rhombus rhombus = new Rhombus("Test Rhombus", 6.0, 8.0);
        assertEquals(24.0, rhombus.area(), EPSILON);
    }

    @Test
    public void testRhombusPerimeter() {
        Rhombus rhombus = new Rhombus("Test Rhombus", 6.0, 8.0);
        double expectedPerimeter = 4 * Math.sqrt(Math.pow(6.0/2, 2) + Math.pow(8.0/2, 2));
        assertEquals(expectedPerimeter, rhombus.perimeter(), EPSILON);
    }

    @Test
    public void testRhombusToString() {
        Rhombus rhombus = new Rhombus("Test Rhombus", 6.0, 8.0);
        assertEquals("Shape: Test Rhombus, Diagonal1: 6.0, Diagonal2: 8.0", rhombus.toString());
    }

    // Right Angled Triangle Tests
    @Test
    public void testTriangleArea() {
        RightAngledTriangle triangle = new RightAngledTriangle("Test Triangle", 3.0, 4.0);
        assertEquals(6.0, triangle.area(), EPSILON);
    }

    @Test
    public void testTrianglePerimeter() {
        RightAngledTriangle triangle = new RightAngledTriangle("Test Triangle", 3.0, 4.0);
        assertEquals(12.0, triangle.perimeter(), EPSILON);
    }

    @Test
    public void testTriangleToString() {
        RightAngledTriangle triangle = new RightAngledTriangle("Test Triangle", 3.0, 4.0);
        assertEquals("Shape: Test Triangle, Base: 3.0, Height: 4.0", triangle.toString());
    }
} 