package kosta.multithread;

import com.sun.jdi.VoidValue;

public class PrintThread extends Thread {
    SharedArea sharedArea;

    public PrintThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            int sum = sharedArea.getTotal();
            System.out.println("계좌 잔액 합계: " + sum);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
