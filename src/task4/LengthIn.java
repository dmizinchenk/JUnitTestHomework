package task4;

public enum LengthIn {
    MILLIMETER(0.001),
    CENTIMETRE(0.01),
    DECIMETER(0.1),
    METRE(1),
    KILOMETER(1_000);

    private double meters;
    LengthIn(double meters) {
        this.meters = meters;
    }

    public double getMeters() {
        return meters;
    }

    public double convertTo(LengthIn value, double length)
    {
        return length * this.meters / value.getMeters();
    }
}
