package lesson17.EvIsi1;

public class HelloWordThread extends Thread{
    @Override
    public void run() {
        System.out.print("helllo");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" word");
    }
}
