package lesson6;

//Ev işi-2
public class MainClass {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Calculator1 calcul = new Calculator1();
        calcul.calculateCircleLength(circle);
    }
}

class Circle {
    double radius;
    double length;

    Circle(int radius) {
        this.radius = radius;
    }

}

class Calculator1 {
    public void calculateCircleLength(Circle circle) {
        circle.length = circle.radius * 3.14 * 2;
        System.out.println("circle.length : " + circle.length);

    }
}
