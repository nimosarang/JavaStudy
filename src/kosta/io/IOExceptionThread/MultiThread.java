package kosta.io.IOExceptionThread;

import kosta.thread.DigtThread;

public class MultiThread {
    public static void main(String[] args) {
        Thread thread1 = new DigitThread();
        Thread thread2 = new AlphabetTread();
        Thread thread3 = new AlphabetSmallTread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class DigitThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class AlphabetTread extends Thread {

    public void run(){
        for(char ch = 'A'; ch <='Z';ch++) {
            try {
                System.out.print(ch);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class AlphabetSmallTread extends Thread {

    public void run(){
        for(char ch = 'a'; ch <='z';ch++) {
            try {
                System.out.print(ch);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}