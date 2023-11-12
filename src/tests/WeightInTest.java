package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import task5.WeightIn;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class WeightInTest {
    WeightIn value;
    double weight;

    public WeightInTest(WeightIn value, double length) {
        this.value = value;
        this.weight = length;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {WeightIn.MILLIGRAM, 0.001},
                {WeightIn.GRAM, 1},
                {WeightIn.KILOGRAM, 1000},
                {WeightIn.HUNDREDWEIGHT, 100_000},
                {WeightIn.TONNE, 1_000_000}
        });
    }

    @Test
    public void getMeters() {
        double expected = this.weight;
        double actual = this.value.getGrams();
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void convertTo() {
        for (WeightIn l : WeightIn.values())
        {
            double expected = 14 * value.getGrams() / l.getGrams();
            double actual = value.convertTo(l, 14);
            assertEquals(expected, actual, 0.0001);
        }
    }
}