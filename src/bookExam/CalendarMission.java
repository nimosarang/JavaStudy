package bookExam;

import java.util.Calendar;

public class CalendarMission {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        cal.set(2023, 1, 1);

        System.out.println(cal.get(Calendar.YEAR) + "년");
        System.out.println(cal.get(Calendar.MONTH) + 1 + "월");

        System.out.println("일\t월\t화\t수\t목\t금\t토");

        int count = 0;
        int startDay = cal.get(Calendar.DAY_OF_WEEK);
        int lastDay = cal.getActualMaximum(Calendar.DATE);

        for (int i = 0; i < startDay; i++) {
            System.out.print("*");
            count++;
        }

        for (int i = 0; i < lastDay; i++) {
            if (count % 7 == 0){
                System.out.println();
            }
            count++;
            System.out.println(i + "\t");
        }


    }
}
