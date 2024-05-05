package Lesson5;

public class ClassAndObject {
    //DERS PRAKTIKASI -1
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.id = 21;
        book1.author = "Elxan Elatli";
        book1.description = "dedektiv";
        book1.name = "Qara yaquar";
        book1.pageCount = 350;
        System.out.println(book1.id);
        System.out.println(book1.author);
        System.out.println(book1.description);
        System.out.println(book1.name);
        System.out.println(book1.pageCount);

    }
}
