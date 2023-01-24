package kosta.io;

import java.io.*;
public class CopyExam {
    //poem3.txt => poem4.txt 로 복사해보기
    public static void main(String[] args) {
        //원본과 복사 파일 객체 생성 -> 스트림 생성 -> 파일 복사 -> 원본으로부터 글자 하나하나 읽어들여서 복사본에 쓰기  -> 스트림 닫기
        try {
            // 파일 객체 생성
            File original = new File("poem3.txt"); //원본 파일 객체 생성
            File copy = new File("poem4.txt"); //복사할 파일 객체 생성

            // 스트림 생성
            FileReader fileReader = new FileReader(original);
            FileWriter fileWriter = new FileWriter(copy);

            // 파일 복사
            int fileCopy = 0;
            // 파일의 끝에 도달 할 때까지 character 하나씩 읽어들임
            while((fileCopy = fileReader.read()) != -1) {
                fileWriter.write(fileCopy);
                System.out.print((char) fileCopy); //잘 나오는지 출력해보기(아스키코드 값을 문자로 변환)
            }
            // 스트림 닫기
            fileWriter.close();
            fileReader.close();

        } catch (FileNotFoundException e) { // FileReader catch
            e.printStackTrace();
        } catch (IOException e) { // FileWriter catch 문
            e.printStackTrace();
        }
    }
}
