package W3resource.Polymorphsim.P3;

public class Circle extends Shape {
    private double r;
    public Circle(double r){
        this.r=r;
    }
    @Override
    public double calculateArea(){
        return Math.PI*r*r;
    }
}
