package Lesson6;

//Dərs praktikası-1
public class Methods {

    public static void main(String[] args) {
        Methods print = new Methods();
        print.printName(5, "inglab");
        print.printName(6, "ali");
        print.printName(7, "arabxan");

    }

    public void printName(int count, String name) {
        for (int i = 0; i < count; i++) {

            System.out.println(i + " names :" + name);

        }


    }
}
