package W3resource.Polymorphsim.P6;

public class Triangle extends Shape1 {
    private double a;
    private double h;
    private double b;

    public Triangle( double a, double h, double b) {
        super();
        this.a = a;
        this.h = h;
        this.b = b;
    }

    public double getA() {
        return a;

    }

    public double getH() {
        return h;
    }

    public double getB() {
        return b;
    }

    @Override
    public double getArea() {
        return a*h/2;
    }

    @Override
    public double getPeremetr() {
        return a + a + b;
    }
}
