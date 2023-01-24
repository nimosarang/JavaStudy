package kosta.thread;

public class SmallLetters implements Runnable{

    @Override
    public void run() {

        for (char i = 'a'; i < 'z'; i++) {
            System.out.print(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
