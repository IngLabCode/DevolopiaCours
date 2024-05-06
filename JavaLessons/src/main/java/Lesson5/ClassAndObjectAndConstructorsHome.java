package Lesson5;

public class ClassAndObjectAndConstructorsHome {
    //Ev işi-2
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 22;
        emp1.adderss = "Resid Behbudov";
        emp1.name = "Inglab";
        emp1.phone = "7330000";
        emp1.salary = 3000;
        emp1.surname = "Aliyev";
        Employee emp2 = new Employee("arabxan");
        Employee emp3 = new Employee("Murad", "Verdizade");
        Employee emp4 = new Employee("Umid", "Sadigli", 4000);
        System.out.println(emp2);
    }
}
