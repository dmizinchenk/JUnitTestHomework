package tests;

import org.junit.Test;
import task1.Rectangle;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void getArea() {
        double width = 2.4;
        double height = 7.8;
        Rectangle r = new Rectangle(width, height);
        double expected = width * height;
        assertEquals(expected, r.getArea(), 0.0001);
    }
}