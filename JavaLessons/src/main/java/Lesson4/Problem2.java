package Lesson4;

import java.util.Scanner;

public class Problem2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eded daxil et:");
        int a = sc.nextInt();
        int count = 0;
        int b = 2;
        Boolean sade = true;
        while (a > count) {
           sade=true;
            for (int i = 2; i < b; i++) {
                if (b % i == 0) {
                    sade = false;
                    break;
                }

            }
            if (sade) {
                count++;
                System.out.println(b);
            } else {
                System.out.println("eded sade deyil :" + b);
            }
            b++;
        }
    }
}