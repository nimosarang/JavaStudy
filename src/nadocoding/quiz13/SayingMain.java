package nadocoding.quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SayingMain {
    public static void main(String[] args) {
        //속담 퀴즈 프로그램 구현해보자
        //퀴즈 내용은 saying.txt 라는 이름의 파일로 제공
        //퀴즈는 문제와 정답이 각각 한 줄로 구성( 퀴즈 3개인 경우 총 6줄)
        //사용자로부터 값을 입력받아 정답여부 확인
        //오답인 경우 정답 안내
        //퀴즈 내용이 더 이상 없을 때까지 반복

        // ex) (문제) 세살 __ 여든까지 간다
        // 정답 입력 => 버릇 or 오답
        //정답입니다 or 오답일 시 틀렸습니다. 정답은 버릇 입니다
        Scanner sc = new Scanner(System.in);
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/eddy/IdeaProjects/Kosta/saying.txt"))){
            System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오.(주관식) ");
            System.out.println("-------------------------------------------");

            String quiz; //문제
            String answer; //정답
            String input; //사용자 입력

            while (true){
                quiz = br.readLine(); // txt파일 문제줄 읽어옴
                answer = br.readLine(); // txt파일 다음 줄인 정답줄 읽어옴
                if(quiz == null || answer == null){
                    break;
                } //더이상 읽어올 문자가 없으면 반복문 탈출

                System.out.println("(문제)" + quiz);
                System.out.print("정답 입력 => ");
                input = sc.next();

                if(input.equals(answer)){
                    System.out.println("정답입니다");
                }else {
                    System.out.println("틀렸습니다. 정답은 " + answer + "입니다.\n");
                }

            }

            System.out.println("-------------------------------------------");
            System.out.println("모든 퀴즈가 끝났어요");
            System.out.println("수고하셨어요");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
