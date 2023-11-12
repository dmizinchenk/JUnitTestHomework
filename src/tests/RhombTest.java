package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import task1.Rhomb;

import static org.junit.Assert.*;

public class RhombTest {
    Rhomb r;
    double diag1;
    double diag2;
    @Before
    public void setUp() throws Exception {
        diag1 = 10.28;
        diag2 = 26.49;
        r = new Rhomb(diag1, diag2);
    }

    @After
    public void tearDown() throws Exception {
        r = null;
    }

    @Test
    public void getArea() {
        assertEquals(diag1 * diag2 / 2, r.getArea(), 0.0001);
    }
}