package nadocoding.quiz09;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExam {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("----------------------------");

        System.out.println("신청학생수(이사전) :" + list.size());
        list.remove("박명수");
        System.out.println("신청학생수(이사후) :" + list.size());
        System.out.println(list.get(3));

        System.out.println("----------------------------------");

        System.out.println("신청학생수(제외전) :" + list.size());
        list.remove(list.size() - 1);
        System.out.println("신청학생수(제외후) :" + list.size());
        System.out.println("---------------------------------");

        for (String s : list
        ) {
            System.out.println(s);
        }
        System.out.println("------------------------------------");
        System.out.println("수강권 양도 전: " + list.get(0));
        list.set(0, "이수근");
        System.out.println("수강권 양도 후: " + list.get(0));
        System.out.println("-------------------------------");

        //확인
        System.out.println(list.indexOf("김종국"));
        //선착순 5명 내에 포함인지
        if (list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("------------------------------");

        //전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 " + list.size());
            System.out.println("리스트가 비었습니다");
        }

        // 다음 학기에 새로 공부 시작
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //정렬
        Collections.sort(list);
        for (String s : list) {System.out.println(s);}

    }
}
