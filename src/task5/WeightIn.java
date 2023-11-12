package task5;

public enum WeightIn {
    MILLIGRAM(0.001),
    GRAM(1),
    KILOGRAM(1000),
    HUNDREDWEIGHT(100_000),
    TONNE(1_000_000);

    private final double gram;
    WeightIn(double meters) {
        this.gram = meters;
    }

    public double getGrams() {
        return gram;
    }

    public double convertTo(WeightIn value, double length)
    {
        return length * this.gram / value.getGrams();
    }
}
