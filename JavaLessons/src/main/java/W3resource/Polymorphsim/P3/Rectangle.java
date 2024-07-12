package W3resource.Polymorphsim.P3;

public class  Rectangle extends Shape {
private double a;
private double b;
private double c;
public Rectangle(double a,double b,double c){
    this.a=a;
    this.b=b;
    this.c=c;

}
@Override
    public double calculateArea(){
    return a*b*c;
}
}
