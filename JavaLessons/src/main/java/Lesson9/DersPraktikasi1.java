package Lesson9;

public class DersPraktikasi1 {
    public static void main(String[] args) {
        String name="cavid";
        System.out.println(name);
        String message="Java dili güclü və effektli bir proqramlaşdırma dilidir";
        System.out.println(message);
        System.out.println(message.length());
        char u=message.charAt(2);
        System.out.println(u);
        int s=message.indexOf('n');
        System.out.println(s);
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        boolean p=message.contains("m");
        System.out.println(p);
        boolean bb=message.endsWith("ge");
        System.out.println(bb);
        boolean pp=message.startsWith("mesag");
        System.out.println(pp);
        name="adil  ";
        System.out.println(name.trim());
        name="bextiyar";
       String sss=name.substring(0,4);
        System.out.println(sss);
        System.out.println(" ");
        name="ali hesenov";
     String[] ss=name.split("");
        for(String i:ss){
            System.out.print(i+" ");
        }

    }
}
