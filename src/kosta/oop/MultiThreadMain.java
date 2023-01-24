package kosta.oop;

import kosta.multithread.Account;
import kosta.multithread.PrintThread;
import kosta.multithread.SharedArea;
import kosta.multithread.TransferThread;

public class MultiThreadMain {
    public static void main(String[] args) {

       SharedArea area = new SharedArea();
       area.account1 = new Account("111", "이몽룡", 20000000);
       area.account2 = new Account("222", "성춘향", 10000000);

        TransferThread thread1 = new TransferThread(area);
        PrintThread thread2 = new PrintThread(area);

        thread1.start();
        thread2.start();

    }
}
