package kosta.io;

import java.io.File;
import java.util.GregorianCalendar;

public class FileExam {
    public static void main(String[] args) {

        File file = new File("."); //ㅎㅕㄴ재 디렉토리 경로명을 가지고 파일

        File arr[] = file.listFiles(); //서브디렉토리와 파일목록 가져옴

        for (int i = 0; i < arr.length; i++) {
            String name = arr[i].getName();
            if(arr[i].isFile()){
                System.out.printf("%-25s %7d", name , arr[i].length());
            }
            if (!arr[i].isFile()){
                System.out.printf("%-25s  <DIR>", name);
            }

            long time = arr[i].lastModified();
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTimeInMillis(time);
            System.out.printf("%1$tF %1$tT %n", calendar);

        }






    }
}
