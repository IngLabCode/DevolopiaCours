package pass_by_reference_ders06;

public class MainClass {
    public static void main(String[] args) {
        Person person = new Person("ingilab", "Aliyev", 444, 5);
        SalaryCalculator salaries = new SalaryCalculator();
        salaries.calculateSalary(person);
        person.printInfo();


    }
}
