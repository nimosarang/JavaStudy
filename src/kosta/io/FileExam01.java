package kosta.io;

import java.io.File;

public class FileExam01 {

    public static void show(File file) {

        if (file.isDirectory()) {

            System.out.println("Dir : " + file.getName());

            File files[] = file.listFiles();

            for (int i = 0; i < files.length; i++) {
                System.out.println("file : " + files[i].getName());
            }
        }else{
            System.out.println("file: " + file.getName());
        }
    }

    public static void main(String[] args) {
//        System.out.println(System.getProperty("user.dir"));

//        show(new File("/Users/eddy/IdeaProjects/Kosta/src/kosta/io")); //현재 이 파일이 위치한 디렉토리,
        show(new File("/Users/eddy/IdeaProjects/Kosta/src/kosta", "Video.java")); //디렉토리와 파일 분리도 가능




    }
}
