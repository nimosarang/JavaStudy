package kosta.api;

import java.util.Scanner;

public class RegularExam1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("문자열 입력: ");
//        String str = sc.nextLine();

//        //abc 문자열이 포함 여부를 체크
//        if(str.matches(".*abc.*")){
//            System.out.println("매칭");
//        }else {
//            System.out.println("비매칭");
//        }

        //숫자 3자리 유무 판단
//        if(str.matches("[\\d]{3}")){ //   \d = [0-9]
//            System.out.println("매칭");
//        }else {
//            System.out.println("비대칭");
//        }

//        //알파벳이나 숫자로만 5자리 '이상' (특문 검지)
//        if(str.matches("[\\w]{5,}")){ //   \d = [0-9]
//            System.out.println("매칭");
//        }else {
//            System.out.println("비대칭");
//        }

//        //한글 3~5자리 입력
//        if(str.matches("[가-힣]{3,5}")){
//            System.out.println("매칭");
//        }else {
//            System.out.println("비대칭");
//        }

        //이메일 관련 검증
        //dolsam77@nate.com = > 매칭
        //342dolsam77@nate.com =>비매칭
        //dolsam77nate.com =>비매칭
        //dolsam77@nate.comcom =>비매칭

//        if(str.matches("^[\\D]\\w+@\\w+\\.\\w{2,3}$")){
//            System.out.println("매칭");
//        }else {
//            System.out.println("비대칭");
//        }

        //일반, 이미지파일 식별
        //abc.jpg, abc.gif, abc.PNG, abc.txt

//        if(str.matches("^\\S+\\.(?!)(jpg|gif|png)$")){   //(?!) 소대문자 구분없이 처리하겠다
//            System.out.println("이미지 파일");
//        }else {
//            System.out.println("일반 파일");
//        }

        //replace 예제
        String message = "124124123SW 개발자 처우와 근무여건 선진국 수준으로 개선해야 ";

//        //SW => 소프트웨어
//        String result = message.replaceAll("SW","소프트웨어");
//        System.out.println(result);

        //문자열 안에 숫자를 모두 제거해 보세요
        String result = message.replaceAll("[0-9]","");
        System.out.println(result);











    }
}
