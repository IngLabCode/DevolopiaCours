package W3resource.Polymorphsim.P5;

public class Football extends Sports{
    private double bonus;
    private double slary;
    private double experience;

    public Football(String gameName,double bonus,double salary,double experience){
        super(gameName);
        this.bonus=bonus;
        this.experience=experience;
        this.slary=salary;

    }
    public double getBonus(){
        return bonus;
    }
    public double getExperience(){
        return experience;
    }
    public double getSlary(){
        return slary;
    }
    @Override
    public double play(){
        return slary+bonus*experience;
    }
}
