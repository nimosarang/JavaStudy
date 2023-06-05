package chunjae_homework.gugudan;

import java.util.Random;
import java.util.Scanner;

public class ThreadTest1_Sample6 {
    public static void main(String[] args) {
        Sample1_threadTest8 thread = new Sample1_threadTest8();
        thread.start();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("정답을 입력해주세요 (종료는 'Exit' 입력): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Exit")) {
                thread.stopThread();
                break;
            }

            boolean correct = thread.checkAnswer(input);
            if (correct) {
                System.out.println("정답입니다!");
            } else {
                System.out.println("틀렸습니다 ㅋ");
            }
        }

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}

class Sample1_threadTest8 extends Thread {
    private volatile boolean running;
    private final Random random;
    private int num1, num2;

    public Sample1_threadTest8() {
        running = true;
        random = new Random();
    }

    @Override
    public void run() {
        while (running) {
            num1 = random.nextInt(8) + 2;
            num2 = random.nextInt(9) + 1;
            System.out.print(num1 + "x" + num2 + "=" + "정답은??");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }

            if (running) {
                System.out.println("아쉽게도 시간 초과!");
            }
        }
    }

    public void stopThread() {
        running = false;
        interrupt();
    }

    public boolean checkAnswer(String answer) {
        int input;
        try {
            input = Integer.parseInt(answer);
        } catch (NumberFormatException e) {
            return false;
        }

        int result = num1 * num2;
        System.out.println("정답은 " + result);
        return input == result;
    }
}
