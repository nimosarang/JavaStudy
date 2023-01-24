package kosta.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarExam2 {

    public static void main(String[] args) {
        //입사일 입력 => 몇년 몇개월 근무 기간 출력
        String pattern = "yyyy/MM/dd";  //이 형식대로 입력 안하면 오류 나오도록 제대로 입력하게 만들기
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

        Scanner sc = new Scanner(System.in);
        System.out.print("날짜를 " + pattern + "형태로 입력하세요(ex: 2023/01/01): ");
        Date indDate = null; //Date -> java.util 꺼 사용

        while (sc.hasNextLine()) {
            try { //입력한 문자열을 parse 하겠다 = 위와 같은 형태가 아니면 예외를 발생시켜 catch 문으로 슝 반복시킴(반복은 while 문)
                indDate = dateFormat.parse(sc.nextLine()); // <Date 를 리턴함>, 문자열을 Date 로 변환
                break;
            } catch (Exception e) {
                System.out.println("다시 입력하세요.");
            }
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(indDate); // setTime -> Date 객체를 Calendar 객체로!, 입사일로 이동

        Calendar today = Calendar.getInstance(); //오늘 날짜

        long day = (today.getTimeInMillis() - cal.getTimeInMillis()) / (24 * 60 * 60 * 1000);   // 시간 분 초
        int m = (int) (day / 30);  //월 30일로 일단 나눔, 정확한건 아닐 수 있다
        int year = m / 12;
        int month = m % 12;

        System.out.println("총 근무기간 : " + year + "년 " + month + "개월 근무");

    }
}
