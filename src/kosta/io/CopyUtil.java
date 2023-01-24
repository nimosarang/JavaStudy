package kosta.io;

import java.io.*;
import java.util.Arrays;

public class CopyUtil {

    public static void copyDirectory(File source, File dest) throws Exception {
        if (source.isDirectory()) {
            dest.mkdirs(); //폴더생성

            File fileList[] = source.listFiles(); //파일들의 목록들을 파일 객체로서 가져옴

            for (File sourceFile : fileList) { //fileList[] 안으로 객체로 바꾼 파일목록들을 저장
                //source => /Users/eddy/Desktop/kosta/image 에서
                //for문 통해 sourceFile => /Users/eddy/Desktop/kosta/image/lufi.JPEG 로 바뀜

                if(sourceFile.isDirectory()){   //  3. 디렉토리의 디렉토리까지 복사 추가 재귀함
                    File d_dest = new File(dest, sourceFile.getName());
                    copyDirectory(sourceFile,d_dest); ///Users/eddy/Desktop/kosta/image1+/why/lufi.JPEG
                }

                File s_dest = new File(dest, sourceFile.getName()); // 경로가 안맞아서 객체 생성 , 겟 네임으로 파일명(lufi.JPEG) 가져와서 경로 맞추기
                copyFile(sourceFile, s_dest); // s_dest =>/Users/eddy/Desktop/kosta/image1//why/lufi.JPEG
            }
        }
    }

    public static void copyFile(File source, File dest) { //폴더가 들어오고 나가게
        FileInputStream in = null;
        FileOutputStream out = null;
        byte arr[] = new byte[500];
        int data = 0;

        try {
            in = new FileInputStream(source);
            out = new FileOutputStream(dest);

            while ((data = in.read(arr)) != -1) {
                out.write(arr);
                Arrays.fill(arr, (byte) 0);  //byte 값을 0으로 초기화
            }
            System.out.println("파일 복사 성공");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close(); //쓰기 먼저 닫기
                }
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
            }
        }
    }
}


