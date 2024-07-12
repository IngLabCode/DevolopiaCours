package lesson13.EvIsi1;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeNoise() {
        return "it ses cixarir";
    }

}
