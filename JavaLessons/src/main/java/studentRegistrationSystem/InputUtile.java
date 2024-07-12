package studentRegistrationSystem;

import java.util.Scanner;

public class InputUtile {
public static String requireTest(String title) {
    Scanner sc = new Scanner(System.in);
    System.out.println(title + ":");
    String answer = sc.nextLine();
    return answer;
}

        public static int requirNumber(String title) {
            Scanner sc = new Scanner(System.in);
            System.out.println(title + ":");
            int answer = sc.nextInt();
            return answer;


        }
}
