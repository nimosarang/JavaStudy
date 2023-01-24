package Mission;

import java.util.Calendar;

public class CalendarKosta {
    public static void main(String[] args) {
        Calendar gc = Calendar.getInstance();
        gc.set(2023, 1, 1);
        int n = gc.getActualMaximum(Calendar.DATE);
        int week = gc.get(Calendar.DAY_OF_WEEK);


        System.out.println("<2023년 2월>");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        for (int i = 1; i < week; i++) {
            System.out.print("\t");
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");

            if ((week + i - 1) % 7 == 0) { //7로 나누어서 나머지가 0이 되면~ ,
                System.out.println();

            }
        }
    }
}
