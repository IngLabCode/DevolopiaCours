package lesson5;

public class ClassAndObjectAndConstructors {
    //DERS PRAKTIKASI -2
    public static void main(String[] args) {
        Computer com1 = new Computer();
        System.out.println(com1.model);
        System.out.println(com1.brand);
        System.out.println(com1.id);
        System.out.println(com1.color);

        Computer com2 = new Computer("ASUS");
        System.out.println(com2.model);

        Computer com3 = new Computer("HP", "gray");
        System.out.println(com3.model);
        System.out.println(com3.color);
    }
}

