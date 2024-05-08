package Lesson5;

//Ev işi-2
public class Employee {
    int id;
    String name;
    String surname;
    String phone;
    String adderss;
    int salary;

    public Employee() {

    }

    public Employee(String name) {
        this.name=name;
        System.out.println(name);
    }

    public Employee(String name, String surname) {
        this.name=name;
        this.surname=surname;
        System.out.println(name);
        System.out.println(surname);
    }

    public Employee(String name, String phone, int salary) {
        this.name=name;
        this.phone=phone;
        this.salary=salary;
        System.out.println(name);
        System.out.println(phone);
        System.out.println(salary);
    }
}
