package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import task2.Currency;
import task2.Money;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class MoneyTest {
    Money ruble;
    double sum = 10_027.68;
    Currency currency;
    double course;

    public MoneyTest(Currency currency, double course) {
        this.currency = currency;
        this.course = course;
        ruble = new Money(sum);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> currencyValues(){
        return Arrays.asList(new Object[][]{
                {Currency.DOLLAR, 92.05},
                {Currency.EURO, 98.32},
                {Currency.POUND_STERLING, 113.11},
                {Currency.YEN, 1 / 1.64},
        });
    }

    @Test
    public void convertTo()
    {
        double expected = this.sum / this.course;
        double actual = ruble.convertTo(currency);
        assertEquals(expected, actual, 0.001);
    }
}