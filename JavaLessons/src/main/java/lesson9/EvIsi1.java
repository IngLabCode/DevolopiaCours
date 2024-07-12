package lesson9;

public class EvIsi1 {
    public static void main(String[] args) {
       String name="meherrem";
        char[]mass=name.toCharArray();
        for(char i:mass){
            System.out.println(i);
        }
        String message="java dilini oyrenmek maraqlidir";
        char[] mm=message.toCharArray();
        for(char i:mm){
            System.out.println(i);
        }
        System.out.println(message.length());
        System.out.println(message.charAt(7));
        System.out.println(message.indexOf('n'));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        boolean bb=message.contains("v");
        System.out.println(bb);
        boolean b1=message.endsWith("ss");
        System.out.println(b1);
        boolean b2=message.startsWith("ss");
        System.out.println(b2);
        name="ayxan";
        System.out.println(name.trim());
        name="kamil";
        String ss=name.substring(0,4);
        System.out.println(ss);
        name="huseyin mehdiade";
        String[] masss=name.split("");
        for (String u:masss){
         System.out.println(u);
        }
    }
    }

