package Lesson4;

import java.util.Scanner;

public class DersPraktikasi2 {
    public static void main(String[] args) {
        //problem1
        for (int i = 1; i < 6; i++) {
            System.out.println("i = " + i);
            //problem2
            Scanner topla = new Scanner(System.in);
            double a = topla.nextDouble();
            double b = topla.nextDouble();
            double c = a + b;
            System.out.println(a + "+ " + b + "= " + c);
            //problem3
            Scanner vur = new Scanner(System.in);
            double d = vur.nextDouble();
            double e = vur.nextDouble();
            double y = a * b;
            System.out.println(d + "* " + e + "= " + y);
            //problem4
            Scanner radius = new Scanner(System.in);
            double r = radius.nextDouble();
            double l = 3.14 * 2 * r;
            System.out.println("l = " + l);
            //problem5
            Scanner number = new Scanner(System.in);
            int m = number.nextInt();
            int sum = 0;
            if (m > 9 && m < 100) {
                sum = m % 10 + m / 10;
            } else if (m > 99 && m < 1000) {
                sum = m / 100 + m % 10 + (m / 10) % 10;
            } else if (m > 999 && m < 10000) {
                sum = m / 1000 + (m / 100) % 10 + (m / 10) % 10 + m % 10;
            } else {
                sum = m / 10000 + (m / 1000) % 10 + (m / 100) % 10 + (m / 10) % 10 + m % 10;
            }
            //problem6**
            Scanner sade = new Scanner(System.in);
            int simpleNumber = sade.nextInt();
            for (int j = 0; j < 10; j++) {
                if (simpleNumber % i != 0 && simpleNumber % simpleNumber == 0) {
                    System.out.println("bu eded sadedeir :" + simpleNumber);
                } else {
                    System.out.println("bu eded sade deyil!");
                }

            }
            //problem7
            int sumNumber = 0;
            for (int u = 1; u < 100; u++) {
                sumNumber = sumNumber + u;
            }
            System.out.println("sumNumber =" + sumNumber);

        }
        //problem8

        for (int t = 1; t < 100; t++) {

            if (t % 7 == 0) {
                System.out.println("number7 =" + t);
            }
        }
        //problem9
        Scanner pair = new Scanner(System.in);
        int numberPair = pair.nextInt();
        if (numberPair % 2 == 0) {
            System.out.println("cut eded :" + numberPair);
        } else {
            System.out.println("cut edyil");
        }
        //problem10
        for (int w = 1; w < 200; w++) {
            if (w % 3 == 0 && w % 7 == 0) {
                System.out.println("eded: " + w);
            }
        }
//        problem11
        int a=20;
        int count=0;
        int b=2;
        boolean sade;
        while (count<a){
            sade=true;
            for (int i=2;i<b;i++){
                if (b%i==0){
                    sade=false;
                    break;
                }

            }
            if (sade){
                count++;
                System.out.println("sade eded "+b);
            }else{
                System.out.println("eded sade deyil :"+b);
            }
            b++;
        }


    }
}
