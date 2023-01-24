package kosta.data;

import java.util.Scanner;
import java.util.Stack;

public class StackExam {
    public static void main(String[] args) {
        //키보드로부터 수학수식을 입력
        // ((2+3)+10) => 괄호가 일치/불일치 판단

        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();

        System.out.println("수식 입력: ");
        String str = sc.nextLine();

        //괄호가 있으면 괄호를 스택에 넣자
        try {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);  //문자 하나하나 가져올거라 char , charAt()

                if (ch == '(') {
                    stack.push(ch + ""); // 캐릭터형을 String 으로 변환하는 쉬운 방법 -> ""을 더해주기
                } else if (ch == ')') {
                    stack.pop();
                }
            }

            if (stack.isEmpty()){ //좌우 괄호 다 뽑아서 비워지면 일치
                System.out.println("괄호가 일치");
            }else {
                System.out.println("괄호가 불일치"); //"main" java.util.EmptyStackException 발생 주의
            }
        } catch (Exception e) {
            System.out.println("괄호가 불일치"); //"main" java.util.EmptyStackException 발생 주의
        }

    }
}
