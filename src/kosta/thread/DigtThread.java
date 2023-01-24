package kosta.thread;
public class DigtThread extends Thread{

    @Override
    public void run() {
        //run 메소드 오버라이딩 후, 멀티스레드 하고자 하는 내용 작성
        for (int i = 0; i < 10; i++) {
            System.out.print(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
