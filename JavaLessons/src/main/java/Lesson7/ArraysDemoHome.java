package Lesson7;

public class ArraysDemoHome {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 5, 4, 7};
        System.out.print("numbers with for : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println(" ");
        System.out.print("numbers withe foreach : ");
        for (int n : numbers) {
            System.out.print(n);
        }
        int w = 0;
        for (int i = 0; i < numbers.length; i++) {
            w += numbers[i];

        }
        System.out.println(" ");
        int t = w / numbers.length;
        System.out.println("the average of the numbers :" + t);
        int number = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (number > numbers[i]) {
                number = numbers[i];
            }
        }
        System.out.println("the small number in the numbers :" + number);
        for (int i = 0; i < numbers.length; i++) {
            if (number < numbers[i]) {
                number = numbers[i];
            }

        }
        System.out.println("the big number in the numbers :" + number);
        System.out.print("the single numbers in the numbers :");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i]);
            }
        }
        System.out.println(" ");
        System.out.print("the pair numbers in the numbers ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i]);
            }
        }



        boolean b = true;
        int counter = 1;
        while (b) {
            b = false;
            for (int i = 0; i < numbers.length - counter; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    b = true;
                    int swap = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = swap;

                }

            }
            counter++;
        }
        System.out.print("sorted array: ");
        for (int u : numbers) {
            System.out.print(u);
        }

    }
}

