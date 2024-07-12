package W3resource.Polymorphsim.P7;

public class Bird extends Animal {
    private String sound;
    private String typeOfMoving;

    public Bird(String name, String sound, String typeOfMoving) {
        super(name);
        this.sound = sound;
        this.typeOfMoving = typeOfMoving;
    }

    public String getSound() {
        return sound;
    }

    public String getTypeOfMoving() {
        return typeOfMoving;
    }

    @Override
    public String move() {
        return typeOfMoving;
    }

    public String makeSound() {
        return sound;
    }
}
