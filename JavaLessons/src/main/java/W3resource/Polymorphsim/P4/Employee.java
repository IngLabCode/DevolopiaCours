package W3resource.Polymorphsim.P4;

public class Employee {
    private String name;
    private String role;
    public Employee(String name,String sunrmae){
        this.name=name;
        this.role =sunrmae;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



    public double calculateSalary(){
        return 0;
    }
}
