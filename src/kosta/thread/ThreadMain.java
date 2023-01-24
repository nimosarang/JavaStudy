package kosta.thread;
public class ThreadMain {
    public static void main(String[] args) {

        Thread thread = new DigtThread(); //스레드 생성
        Thread thread1 = new Thread(new SmallLetters());

        thread.start(); //스레드를 시작

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
