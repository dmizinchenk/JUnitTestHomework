package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import task1.Square;

import static org.junit.Assert.*;

public class SquareTest {
    Square square;
    double side = 6.8;

    @Before
    public void setUp() throws Exception {
        square = new Square(side);
    }

    @After
    public void tearDown() throws Exception {
        square = null;
    }

    @Test
    public void getArea() {
        assertEquals(side * side, square.getArea(), 0.0001);
    }
}