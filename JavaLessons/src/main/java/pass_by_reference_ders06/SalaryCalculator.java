package pass_by_reference_ders06;

public class SalaryCalculator {
    public void calculateSalary(Person person1) {
        person1.salary = person1.experienceYear * 500;


    }
}
