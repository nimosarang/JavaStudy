package kosta.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {

    public static void main(String[] args) {

//        GregorianCalendar gc = new GregorianCalendar();
        Calendar gc = Calendar.getInstance(); // 오늘 현재시간 대입
//        System.out.println(gc);
        String now = gc.get(Calendar.YEAR) + "년/"
                    + (gc.get(Calendar.MONTH) + 1 ) + "월/" // 0월부터 시작이라서 +1
                    + gc.get(Calendar.DATE) + "일/"
                    + gc.get(Calendar.HOUR) + "시/"
                    + gc.get(Calendar.MINUTE) + "분/";

        System.out.println("현재시간: " + now);

        gc.add(Calendar.DATE, 100); //100일 증가

        String future = gc.get(Calendar.YEAR) + "년/"
                + (gc.get(Calendar.MONTH) + 1 ) + "월/" // 0월부터 시작이라서 +1
                + gc.get(Calendar.DATE) + "일/"
                + gc.get(Calendar.HOUR) + "시/"
                + gc.get(Calendar.MINUTE) + "분/";

        System.out.println("100일 후: " + future);

        gc.set(2022,11,11); //2022년 12월 11일을 나타냄, 월은 0부터 시작
        gc.add(Calendar.DATE, 100);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm"); //포맷 지정가능

        String str = dateFormat.format(gc.getTime());  //캘린더형을 데이트형으로 형변환 하기 위함!
        System.out.println(str);

        //2023~2033 새해 요일은~??
        char week[] = {'일','월','화','수','목','금','토'}; // 날짜요일은 1부터 , 배열은 0부터 시작

        for (int i = 2023; i < 2033; i++) {
            gc.set(i,0,1);  // 년도는 계속 돌리니깐 i, 1월 1일
            char c = week[gc.get(Calendar.DAY_OF_WEEK)-1]; //캐릭터값으로 값을 하나 받기, -1해줘야 0부터 시작
            System.out.println(i + "년도 새해 요일은 " + c + "요일 입니다." );
        }




    }
}
