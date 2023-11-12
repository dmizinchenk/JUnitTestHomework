package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import task1.Triangle;

import static org.junit.Assert.*;

public class TriangleTest {
    Triangle triangle;
    double sideA = 5.7;
    double sideB = 9.2;
    double sideC = 3.24;

    @Before
    public void setUp() throws Exception {
        triangle = new Triangle(sideA, sideB, sideC);
    }

    @After
    public void tearDown() throws Exception {
        triangle = null;
    }

    @Test
    public void getArea() {
        double p = (sideA + sideB + sideC) / 2;
        assertEquals(Math.sqrt(p * (p - sideA) * (p - sideB)  * (p - sideC)), triangle.getArea(), 0.0001);
    }
}