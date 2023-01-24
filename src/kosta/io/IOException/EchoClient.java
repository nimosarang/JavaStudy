package kosta.io.IOException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    private static final String ServerIP = "localhost";
    private static final int PORT = 10001;

    public static void main(String[] args) {
        Socket socket = null;
        Scanner sc = new Scanner(System.in);

        try {
            socket = new Socket();
            socket.connect(new InetSocketAddress(ServerIP, PORT));

            //중요
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());

            while (true) {
                System.out.print("<-");
                String request = sc.nextLine();

                if (request == null) {
                    System.out.println("접속 종료");
                    break;

                } else {
                    printWriter.print(request + "\n");  //File Writer 내부 버퍼내용 파일을 출력
                    printWriter.flush(); //flush 는 보내주는 역할, 만약 없으면 전달할 내용이 내부에만 남고 출력되어 보내지지않음
                    // 즉, flush는 write에 저장된 값을 출력함과 동시에 비워주는 역할
                    System.out.println("->" + bufferedReader.readLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null && socket.isClosed() == false) { //소켓이 널이 아니고, 소켓이 닫힌 상태가 아니라면 닫아주자
                try {
                    socket.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
