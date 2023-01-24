package nadocoding.quiz11;

import java.io.FileWriter;
import java.io.IOException;

public class Throws {
    public static void main(String[] args){
        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인 메소드에서 해결할게요.");
        }

    }

    public static void writeFile() throws IOException { //예외를 여기서 처리하지 않고 메인으로 던짐
//        try {
//            FileWriter writer = new FileWriter("test123.text");
//            throw new IOException("파일 쓰기에 실패했어요");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("writeFile 메소드 내에서 자체 해결했어요");
//        }
        FileWriter writer = new FileWriter("test123.text");
        throw new IOException("파일 쓰기에 실패했어요");

    }

}

