package kosta.io.IOException;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket();
            serverSocket.bind( new InetSocketAddress("Localhost", 10001));
            System.out.println("[서버] 연결 기다림");
            Socket socket = serverSocket.accept();
            System.out.println("[서버] 연결됨");

            InetSocketAddress inetSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
            System.out.println( "[서버] 연결됨 from " +
                    inetSocketAddress.getHostName() + ":" +
                    inetSocketAddress.getPort() );
            // 데이터 보내기
            OutputStream os = socket.getOutputStream();
            String data = "채팅 서버에 접속을 환영합니다 \n";
            os.write( data.getBytes( "UTF-8" ) );
            os.flush();

            // 데이터 받기
            InputStream is = socket.getInputStream();
            while( true ) {
                byte[] buffer = new byte[128];
                int readByteCount = is.read( buffer );

                if( readByteCount < 0 ) {
                    System.out.println( "[서버] 클라이언트로 부터 연결끊김" );
                    break;
                }

                String recvData = new String( buffer, 0, readByteCount, "UTF-8" );
                System.out.print( recvData );

                //
                if(recvData.equalsIgnoreCase("exit")){
                    System.out.println("[서버] 클라이언트로 통신 종료 요청");
                    break;
                }

                recvData += "!!!";
                os.write(recvData.getBytes("UTF-8"));
                os.flush();
                //
            }

            os.close();
            is.close();
            socket.close();

        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(serverSocket != null && !serverSocket.isClosed()) {
                try {
                    serverSocket.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
