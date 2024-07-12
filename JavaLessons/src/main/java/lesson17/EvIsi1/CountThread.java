package lesson17.EvIsi1;

public class CountThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("i :" + i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 6; i < 11; i++) {
            System.out.println("i :" + i);
        }
    }
}
