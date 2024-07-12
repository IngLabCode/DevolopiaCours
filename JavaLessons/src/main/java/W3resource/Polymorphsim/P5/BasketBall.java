package W3resource.Polymorphsim.P5;

public class BasketBall extends Sports{
    private double bonus;
    private double salary;
    public double experience;
    public double getBonusonus(){
        return bonus;
    }
    public double getExperience(){
        return experience;
    }
    public double getSalary(){
        return salary;
    }
    public BasketBall(String gameName,double salary,double bonus,double experience){
        super(gameName);
        this.bonus=bonus;
        this.experience=experience;
        this.salary=salary;

    }
    public double play(){
        return salary+bonus*experience;
    }

}
