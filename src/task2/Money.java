package task2;

public class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }
    public double convertTo(Currency currency)
    {
        return amount / switch (currency){
            case DOLLAR -> 92.05;
            case EURO -> 98.32;
            case POUND_STERLING -> 113.11;
            case YEN -> 1 / 1.64;
        };
    }
}
