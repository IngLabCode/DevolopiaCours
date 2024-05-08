
public class Test2 {


    public static void main(String[] args) {
        metid2();
    }

    public static int metod1(int a, int b) {
        return a + b;
    }

    public static void metid2() {
        if (metod1(1, 2) == 4) {
            return;
        } else
            System.out.println("kod davam edir");

    }
}
