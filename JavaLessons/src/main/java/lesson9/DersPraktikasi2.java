package lesson9;

import java.util.Random;
import java.util.Scanner;

public class DersPraktikasi2 {
    public static void main(String[] args) {
        method("salam","sa","mm");
        char[] mass = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        String s = String.copyValueOf(mass);
        System.out.println(s);
        boolean b = false;
        String ss = "[a-z]{7}";
        System.out.println(s.matches(ss));
        System.out.println(s.isBlank());
        Random rr = new Random();
        int a = rr.nextInt(30, 50);
        System.out.println(a);
        System.out.println("eded daxil et:");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        System.out.println("quvvet daxil et:");
        int w = sc.nextInt();
        double r = Math.pow(p, w);
        System.out.println("eded: " + r);
        double dd = sc.nextDouble();
        String ww = String.format("%.1f", dd);
        System.out.println(ww);
    }

    public static String method(String s1, String s2, String s3) {
        String g="false";
        if (s1.contains(s2)) {
            g=s1.replace(s2,s3);
            System.out.println(g);

        }
        return g;
    }
}





