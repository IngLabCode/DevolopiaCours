package Lesson14.EvIsi1;

public class Dividing2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        int c;
        try {
            //c = a / b;
            String l="nmr";
            int g=Integer.parseInt(l);
        } catch (ArithmeticException ex) {

            System.out.println("0-a bolme yoxdur");
        }catch (NumberFormatException ex2){
            System.out.println("yanlis format");
        }
    }
}
