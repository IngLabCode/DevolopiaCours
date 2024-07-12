package W3resource.Polymorphsim.P3;

public class Triangle extends Shape{
    private double h;
    public double a;
    public Triangle(double h,double a){
        this.h=h;
        this.a=a;

    }
    @Override
    public double calculateArea(){
        return (a*h)/2;
    }
}
