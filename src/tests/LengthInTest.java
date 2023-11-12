package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import task4.LengthIn;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LengthInTest {
    LengthIn value;
    double length;

    public LengthInTest(LengthIn value, double length) {
        this.value = value;
        this.length = length;
    }

    @org.junit.runners.Parameterized.Parameters
    public static java.util.Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {LengthIn.MILLIMETER, 0.001},
                {LengthIn.CENTIMETRE, 0.01},
                {LengthIn.DECIMETER, 0.1},
                {LengthIn.METRE, 1},
                {LengthIn.KILOMETER, 1000}
        });
    }

    @Test
    public void getMeters() {
        double expected = this.length;
        double actual = this.value.getMeters();
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void convertTo() {
        for (LengthIn l : LengthIn.values())
        {
            double expected = 25 * value.getMeters() / l.getMeters();
            double actual = value.convertTo(l, 25);
            assertEquals(expected, actual, 0.0001);
        }
    }
}