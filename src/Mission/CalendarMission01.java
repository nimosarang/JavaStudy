package Mission;

import java.util.Calendar;
public class CalendarMission01 {
    public static void main(String[] args) {

        //캘린더 추상메소드 생성
        Calendar cal = Calendar.getInstance();

        // ----년 -월 -일의 달력 set
        cal.set(2023, 1, 1); //가운데 month가 1인 이유: 1월 = 0 . 즉 월은 0부터 시작

        // 년
        System.out.print(cal.get(Calendar.YEAR) + "년 ");

        // 월
        System.out.println((cal.get(Calendar.MONTH) + 1) + "월 ");
//
//        // 일
//        System.out.println(cal.get(Calendar.DATE) + "일 ");

        System.out.println("일\t월\t화\t수\t목\t금\t토"); //여기까지 달력 상단에 보여줄 내용 출력물들

        int day = 0;
        int startDay = cal.get(Calendar.DAY_OF_WEEK); // 4 // 현재 월의 시작 요일, 2월기준 : 4, 수요일부터 시작  (1 :일요일 ~ 7: 토요일)
        int lastDay = cal.getActualMaximum(Calendar.DATE); // 28 // 현재 월의 마지막 날짜, 2월기준 28일이 마지막 날짜
//        System.out.println(startDay); 출력해보면 2월 set 기준 4 출력됨
//        System.out.println(lastDay); 출력해보면 2월 set 기준 28 출력됨

        for (int i = 1; i < startDay; i++) { // 조건식이 i<4 이므로 1~3 까지 왼쪽부터 순서대로 for문이 돌아가면서 공백으로 채움
            System.out.print("*\t"); // ("\t") 입력 시 문제에서 원하는 공백으로 출력됨
            day++;
        }

        for (int i = 1; i <= lastDay; i++) { //28일까지 나와야 하니깐 i <'=' lastDay
            if (day % 7 == 0) { // % 나머지값을 활용하여 7번째 줄 넘어가면 다음줄로 점프
                System.out.println(); //if문 조건이 트루일 때 이 프린트 명령문으로 줄바꾸기
            }
            day++;
            System.out.print(i + "\t"); // 1~28일까지 출력
        }
    }

}


