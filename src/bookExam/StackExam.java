package bookExam;

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

        try {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch == '(') {
                    stack.push(ch + "");
                } else if (ch == ')') {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                System.out.println("괄호가 일치");
            } else {
                System.out.println("불일치");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
