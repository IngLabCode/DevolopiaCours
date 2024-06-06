package Lesson13.EvIsi2;

public class Employee extends Person{
    private int salary;
    private String department;
    private int password;

    public Employee(String name, String surname, String address, int age, int phone, int id,String department,int salary,int password) {
        super(name, surname, address, age, phone, id);
        this.department=department;
        this.password=password;
        this.salary=salary;
    }
    public String getDepartment(){
        return department;
    }
    public int getSalary(){
        return salary;
    }
    public int getPassword(){
        return password;
    }

    @Override
    public void printInfo(){
       super.printInfo();
        System.out.println("salary : "+getSalary());
        System.out.println("password : "+getPassword());
        System.out.println("department : "+getDepartment());
    }
}
