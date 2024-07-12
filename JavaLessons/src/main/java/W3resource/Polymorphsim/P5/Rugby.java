package W3resource.Polymorphsim.P5;

public class Rugby extends Sports{
    private double slary;
    private double experience;
    private double bonus;

    public Rugby(String gameName,double slary,double experience,double bonus){
        super(gameName);
        this.bonus=bonus;
        this.experience=experience;
        this.slary=slary;


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
