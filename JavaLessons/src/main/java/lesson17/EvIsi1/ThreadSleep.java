package lesson17.EvIsi1;

public class ThreadSleep implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <6 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("i : "+i);

        }
    }
}
