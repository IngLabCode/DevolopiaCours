package lesson9;

import java.util.Random;
import java.util.Scanner;

public class EvIsi2 {
    public static void main(String[] args) {
        char[] cr = new char[]{'a', 'v', 'r', 'y', 'p'};
        String ss = String.copyValueOf(cr);
        System.out.println(ss);
        System.out.println(ss.length()==3);
        System.out.println(ss.isBlank());
        Random random=new Random();
        int i=random.nextInt(10,31);
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("eded daxil edin: ");
        double y=sc.nextDouble();
        String dd=String.format("%.2f",y);
        System.out.println(dd);
        method("salam","am");

    }
    public static   boolean method(String s1,String s2){
        boolean b=false;
        if (s1.endsWith(s2)) {
        b=true;
        }
        System.out.println(b);
        return b;
        }
    }

