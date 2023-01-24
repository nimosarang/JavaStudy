package kosta.io;

import java.io.*;

public class BufferExam {
    public static void main(String[] args) {
        //Scanner => 키보드 입력
        //System.in => InputStream (바이트스트림)
        // => 새로운 스트림 하나 더 연결 InputStreamReader(파라미터값이 InputStream 이 와야 함) => BufferedReader

//        //<정석적인 연결 방법>
//        InputStream in = System.in; // InputStream 이 리턴
//        InputStreamReader isr = new InputStreamReader(in);
//        BufferedReader br = new BufferedReader(isr);

        BufferedReader br = null;
        BufferedWriter bw = null; //try catch 로 close 닫아 주기 위함

        try {
            br = new BufferedReader(new InputStreamReader(System.in)); // 한 줄로 끝내기
            bw = new BufferedWriter(new FileWriter("output.txt"));

            System.out.println("입력: ");
            String str = "";

            while ((str = br.readLine()) != null) {  // br.readLine() 이 핵심
                str += "\n";
                bw.write(str);
            }
            System.out.println("쓰기 완료!! ");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                br.close();
            }catch (Exception e2){}

        }
    }
}
