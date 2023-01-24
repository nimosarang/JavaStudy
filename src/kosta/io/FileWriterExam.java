package kosta.io;

import java.io.FileWriter;
import java.util.Scanner;
public class FileWriterExam {
    public static void main(String[] args) {
        //키보드로 부터 문자열을 입력 받아 파일쓰기를 구현하자
        //"q" 를 입력하면 종료 => q를 입력하기 전까지의 문자열을 파일쓰기를 하자.
        //입력> 안녕
        //입력> 반갑다
        //입력> q > 종료
        //FileWriter : write(문자열);
        //파일명 : poem2.txt : 실존x => 반드시 close() => 파일 생성

        FileWriter writer = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("입력> ");
        String str = "";
        String poem = "";

        while (!(str = sc.nextLine()).equals("q")) {
            System.out.println("입력> ");
            poem += str;
            poem += "\n"; // 개행문자 엔터
        }

        try {
            writer = new FileWriter("poem3.txt");
            writer.write(poem);

        } catch (Exception e) {
            e.printStackTrace();

        } finally {

            try {
                writer.close();

            } catch (Exception e2) {

            }
        }
    }
}
