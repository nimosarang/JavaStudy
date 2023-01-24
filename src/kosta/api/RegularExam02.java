package kosta.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam02 {
    public static void main(String[] args) {
//        String data[] = {
//                "bat", "bba", "bbg", "bonus",
//                "CA", "ca", "c232", "car",
//                "date", "dic", "diraaa"
//        };
//
//        Pattern p = Pattern.compile("c[a-z]*"); // 패턴객체 생성,  객체화 시킨다
//
//        for (int i = 0; i < data.length; i++) { // Pattern은 Matcher를 리턴
//            Matcher m = p.matcher(data[i]);
//            if(m.matches()){
//                System.out.println(data[i]);  //매칭된 것만 뽑아주겠다,  c[a-z]* => ca, car
//            }
//        }

//        String source = "ab?cd?de?gh";
//        String reg = "(\\w*)";
//
//        Pattern p = Pattern.compile(reg);
//        Matcher m = p.matcher(source);
//
//        while(m.find()){
//            System.out.println(m.group());
//        }

        String source = "HP: 010-1111-1111, HOME: 02-2222-2222";
        String reg = "(\\d{2,3}-\\d{3,4}-\\d{4})";

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(source);

        while (m.find()){
            System.out.println(m.group());
        }






    }
}
