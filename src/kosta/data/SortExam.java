package kosta.data;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class SortExam {
    public static void main(String[] args) {
        //Arrays.sort(배열) -> 오름차순
        //List -> 입력순서 -> 정렬순서
        //Collections.sort(list);
        //기본 정렬 조건 : Comparable 을 implements 해서 -> compareTo() 오버라이딩
        //정렬기준 변경 : Comparator 인터페이스를 -> compare() 오버라이딩

        Random r = new Random();
        TreeSet<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) { // o1 앞놈
                //내림차순 정렬 기준 정의 만들기
                if (o1 < o2) {
                    return 1; // 자리바꾸기 양수
                } else if (o1 > o2) {
                    return -1; // 자리 안바꿈
                }
                return 0;
            }
        }); // new

        for (int i = 0; set.size() < 6; i++) {
            set.add(r.nextInt(45) + 1);
        }
        System.out.println(set);


    }
}
