package studentRegistrationSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu=InputUtile.requirNumber("what do you want");
        if (menu == 1) {

        Scanner sc = new Scanner(System.in);
        System.out.println("how many students :");
        int count = sc.nextInt();
        Config.students = new Student[count];
        for (int i = 0; i < count; i++) {
            System.out.println(i + 1 + "reguster");

            System.out.println("Menu" +
                    "\n1.register the student" +
                    "\n2.show the student" +
                    "\n3.find the student" +
                    "\n4.update the student");
            sc = new Scanner(System.in);
            System.out.println("enter the menu number:");

            String name=InputUtile.requireTest("enterName");
            String surname=InputUtile.requireTest("enterSurname");
            int age=InputUtile.requirNumber("enterAge");
            String classname=InputUtile.requireTest("enterCalssname");





                Student student = new Student(name, surname, age, classname);
                System.out.println("name=" + name);
                System.out.println("surname=" + surname);
                System.out.println("age=" + age);
                System.out.println("classname=" + classname);

                Config.students[i] = student;
            }
            for (int j = 0; j < Config.students.length; j++) {


            }

        }


    }
}
