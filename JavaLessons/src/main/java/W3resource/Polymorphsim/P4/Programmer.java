package W3resource.Polymorphsim.P4;

public class Programmer extends Employee{
    private double baseSalary;
    private double bounus;
    public Programmer(String name,String role,double baseSalary,double bounus){
        super(name,role);
        this.baseSalary=baseSalary;
        this.bounus=bounus;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBounus() {
        return bounus;
    }

    public void setBounus(double bounus) {
        this.bounus = bounus;
    }
    @Override
    public double calculateSalary(){
        return baseSalary+bounus;
    }
}
