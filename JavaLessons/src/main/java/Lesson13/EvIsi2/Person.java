package Lesson13.EvIsi2;

public class Person {
    private String name;
    private String surname;
    private String address;
    private int phone;
    private int id;

    public Person(String name, String surname, String address, int age, int phone, int id) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.id = id;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;

    }

    public int getPhone() {
        return phone;

    }

    public int getId() {
        return id;
    }
    public void printInfo(){
        System.out.println("name : "+getName());
        System.out.println("surname : "+getSurname());
        System.out.println("id : "+getId());
        System.out.println("adress : "+getAddress());
        System.out.println("phone : "+getPhone());

    }
}
