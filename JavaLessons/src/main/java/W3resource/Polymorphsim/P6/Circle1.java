package W3resource.Polymorphsim.P6;

public class Circle1 extends Shape1 {
    private double radius;

    public Circle1( double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getarea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getperemetr() {
        return 2*Math.PI*radius;
    }
}
