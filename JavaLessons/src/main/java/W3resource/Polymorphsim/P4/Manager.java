package W3resource.Polymorphsim.P4;

public class Manager extends Employee {
    private double baseSalary;
    private double bonus;
    public Manager(String name,String role,double baseSalary,double bonus){
        super(name,role);
        this.baseSalary=baseSalary;
        this.bonus=bonus;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    } @Override
    public double calculateSalary(){
        return bonus+baseSalary;
    }
}
