package task1;

public class Rhomb implements FigureInfo{
    double d1;
    double d2;

    public Rhomb(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    public double getArea() {
        return d1 * d2 / 2;
    }
}
