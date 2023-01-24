package game;

import java.util.Scanner;

public class Tryman {

    public static void main(String[] args) {
        //배열 만들기 2개
        //변수 선언 3가지
        //난수 생성하고 난수에 게임 조건 주기

        int computer[] = new int[3];
        int user[] = new int[3];

        int ch = 0; // 유저 정답 입력값 범위
        int count = 0;
        boolean randomBall = true;

        while (randomBall) {
            for (int i = 0; i < computer.length; i++) {
                computer[i] = (int) (Math.random() * 9 + 1);
            } // 숫자를 만드는데 3자리 숫자가 다 다르게해서 while 문을 탈출할 수 있도록
            if (computer[0] != computer[1] && computer[0] != computer[2] && computer[1] != computer[2]) {
                randomBall = false; // 거짓이면 종료
            }
        }
        randomBall = true; // while 문이 참이면 계속 반복

        //게임시작!
        //스트라이크와 볼 선언해주고 입력기능 구현
        //게임 숫자 입력 범위 validation 조건 구현

        System.out.println("야구게임 스따뚜리~");

        while (randomBall) {
            int strike = 0;
            int ball = 0;

            System.out.println("3개의 숫자를 입력해주세요: ");
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < user.length; i++) {
                try {
                    ch = sc.nextInt();
                    user[i] = ch;
                    if (ch > 10 || ch < 0) {
                        System.out.println("1~9 사이의 숫자만 입력해주세요");
                    }
                } catch (Exception e) {
                    System.out.println("잘못 입력하셨어요!!");
                }
            }
            //입력받은 값과 컴퓨터 난수 값 비교하여 스트라이크와 볼 판단 조건 구현
            // 한게임에서 3개 스타라이크면 게임이 끝나며 탈출하기
            // 몇번만에 맞추었는지 알려주고 게임 끝 출력

            for (int i = 0; i < computer.length; i++) {
                for (int j = 0; j < user.length; j++) {
                    if (computer[i] == user[j] && i == j) {
                        strike++;
                    }
                    if (computer[i] == user[j] && i != j) {
                        ball++;
                    }
                }
            }

            System.out.println("strike:" + strike + " ball: " + ball);

            if (strike == 3) {
                randomBall = false;
            }
            count++;
        }

        System.out.println("횟수 : " + count);
        System.out.println("게임 끝");
    }


}

