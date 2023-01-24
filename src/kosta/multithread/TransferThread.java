package kosta.multithread;

public class TransferThread extends Thread{

    SharedArea sharedArea;

    public TransferThread(SharedArea sharedArea) { //생성자
        this.sharedArea = sharedArea;
    }

    @Override
    public void run() {
        for (int i = 0; i < 12; i++) {
            try {
                sharedArea.transfer(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
