package W3resource.Polymorphsim.P6;

public class Rectangle extends Shape1 {
    private double a;
    private double b;
    private double c;

    public Rectangle(double a, double b, double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double getArea() {
        return a*b*c;
    }

    @Override
    public double getPeremetr() {
        return 2*(a+b+c);
    }
}
