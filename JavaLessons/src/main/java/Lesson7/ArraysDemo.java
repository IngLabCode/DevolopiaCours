package Lesson7;

//Ders praktikasi-1
public class ArraysDemo {
    public static void main(String[] args) {
        int[] numbers = new int[]{7, 2, 3, 4, 5};
        int n = 0;
        int m = 0;
        for (int i = 0; i < numbers.length; i++) {
            n = n + numbers[i];
        }
        m = n / numbers.length;
        System.out.println("sum of the numbers: " + n);
        System.out.println("the average of the numbers: " + m);
        int t = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (t > numbers[i]) {
                t = numbers[i];
            }

        }
        System.out.println("the small number in the numbers: " + t);
        System.out.print("the single number in the numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2!=0){
                System.out.print(+numbers[i]+" ");
            }

        }


    }


}
