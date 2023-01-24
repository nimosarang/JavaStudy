package kosta.oop3;

public class MyThread implements Runnable{
    //인터페이스 특징 중 API 활용한 인터페이스 예시

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(1000);

            }catch (Exception e){}
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MyThread my = new MyThread();
        Thread t = new Thread(my);
        t.start();

        for (int i = 11; i < 20; i++) {
            try {
                Thread.sleep(1000);

            }catch (Exception e){}
            System.out.println(i);
        }

    }

}
