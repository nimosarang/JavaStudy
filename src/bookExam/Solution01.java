package bookExam;

import java.util.Scanner;

public class Solution01 {

    public int solution(String str, char c){
        int answer = 0;

        str = str.toUpperCase(); //대문자로 변경
        c = Character.toUpperCase(c); //문자하나 대문자로 변경

        for(char x : str.toCharArray()){
            if(x==c) answer++;
        }
        return  answer;
    }

    public static void main(String[] args) {

        Solution01 s = new Solution01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); //Computercooler
        char c = sc.next().charAt(0);

        System.out.println(s.solution(str,c));

    }
}
