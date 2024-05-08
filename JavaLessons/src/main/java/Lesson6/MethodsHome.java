package Lesson6;
//Ev işi-1
public class MethodsHome {
    public static void main(String[] args) {
        MethodsHome hometask = new MethodsHome();
        hometask.printNumbers(2, 6);
        hometask.printNumbers(8, 12);
        hometask.printNumbers(9, 33);
    }

    public void printNumbers(int begin, int end) {
        for (int i = begin; i < end; i++) {
            System.out.println(i);
        }

    }
}
