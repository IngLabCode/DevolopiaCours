package lesson13.EvIsi1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 4);
        Dog dog = new Dog("Dog", 7);
        Lion lion = new Lion("Lion", 3);
        String cat1 = cat.makeNoise();
        String dog1 = dog.makeNoise();
        String lion1 = lion.makeNoise();
        System.out.println("name : " + cat.getName() + " age : " + cat.getAge() + " sound : " + cat1);
        System.out.println("name : " + dog.getName() + " age : " + dog.getAge() + " sound : " + dog1);
        System.out.println("name : " + lion.getName() + " age : " + lion.getAge() + " sound : " + lion1);
    }
}
