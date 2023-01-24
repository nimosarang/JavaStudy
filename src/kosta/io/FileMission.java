package kosta.io;

import java.io.File;

public class FileMission {
    public static void main(String[] args) {
        //1.바이트 스트림을 이용하여 이미지 파일을 복사해보자
//        String source = "/Users/eddy/Desktop/kosta/image/why/잔루.JPEG";
//        String dest = "/Users/eddy/Desktop/kosta/image/why1/잔루.JPEG"; // JPG 가 여기로 복사되길 원함

//        CopyUtil.copyFile(new File(source),new File(dest));

//        2.디렉토리 전체 복사를 구현하자

//        String source = "/Users/eddy/Desktop/kosta/image/why/";  // why 폴더 + why 폴더안의 이미지파일들 복사 할 것
//        String dest = "/Users/eddy/Desktop/kosta/image/why1"; // image폴더 안에 중복된 이름 why 가 발생하지않도록 복제할 why폴더를 why1로 작명 (why 폴더 + why 폴더안의 이미지파일들 복사 할 것)

//        try {
//            CopyUtil.copyDirectory(new File(source),new File(dest));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //3 디렉토리 안에 디렉토리까지 복사해봅시다
        String source = "/Users/eddy/Desktop/kosta/image";
        String dest = "/Users/eddy/Desktop/kosta/image1";

        try {
            CopyUtil.copyDirectory(new File(source),new File(dest));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
