package Lesson5;

public class ClassAndObjectHome {
    //Ev işi-1
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.age = 21;
        person1.id = 33;
        person1.name = "Inglab";
        person1.phone = "7330000";
        person1.surname = "Aliyev";
        System.out.println(person1.age);
        System.out.println(person1.id);
        System.out.println(person1.name);
        System.out.println(person1.phone);
        System.out.println(person1.surname);

        Person person2 = new Person();
        person2.surname = "Ramazanov";
        person2.name = "Arabxan";
        person2.phone = "8790000";
        person2.age = 20;
        person2.id = 88;

    }
}
