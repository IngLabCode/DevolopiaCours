package pass_by_reference_ders06;

public class Person {
    String name;
    String surname;
    int experienceYear;
    int salary;
    int phone;

    Person(String name, String surname, int phone, int experienceYear) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.experienceYear = experienceYear;
    }

    public void printInfo() {
        System.out.println("name :" + name);
        System.out.println("surname :" + surname);
        System.out.println("experienceYear" + experienceYear);
        System.out.println("salary" + salary);
        System.out.println("phone" + phone);
    }
}
