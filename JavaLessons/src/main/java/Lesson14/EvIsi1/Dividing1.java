package Lesson14.EvIsi1;

public class Dividing1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        int c;
        try {
            c = a / b;
        } catch (ArithmeticException ex) {

            System.out.println("0-a bolme yoxdur");
        }
    }
}
