package kosta.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class CopyExam01 {
    public static void main(String[] args) {
        //poem4.txt -> poem5.txt 로 복사

        FileReader reader = null;
        FileWriter writer = null;
        char[] arr = new char[10];

        try {

            reader = new FileReader("poem4.txt");
            writer = new FileWriter("poem5.txt");

            while (true) { //복사 알고리즘
                Arrays.fill(arr, ' '); //돌때마다 초기화
                int data = reader.read(arr);
                if (data == -1) break;
                writer.write(arr);
            }

            System.out.println("복사 완료!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close(); // 쓰기 먼저 클로즈해야함!!
                reader.close();
            } catch (Exception e2) {}
        }
    }
}
