package kosta.data;

import java.util.*;

public class MapMission {
    public static void main(String[] args) {
        //이름, 점수를 한쌍으로 Map 자료구조로 구현하자 => 김자바 : 80, 박자바 : 70
        //1. 시험 응시자만 전체 출력
        //2. 총점, 평균, 최고점수, 최저점수 구현   (Collections => max(), min() 활용해볼라면 해보세용)

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("손진경", 100);
        map.put("최병호", 80);
        map.put("안성민", 60);
        map.put("남소현", 40);
        map.put("김소영", 20);
        map.put("김민규", 10);

        //응시자만 -> map => key 추출
        Set<String> set = map.keySet();
        System.out.println("<응시자들>");
        System.out.println(set); //set 은 안에 toString 있어서 출력만 해주면 된다.

        //map -> value 추출
        Collection<Integer> values = map.values();
        Iterator<Integer> iter = values.iterator();

        int total = 0;
        while (iter.hasNext()){
            total += iter.next();
        }

        System.out.println("총점: " + total);
        System.out.println("총점: " + total/map.size());
        System.out.println("최고점수: " + Collections.max(values));
        System.out.println("최저점수: " + Collections.min(values));


//        //1.시험응시자만 전체출력
//        System.out.println("<시험 응시자>");
//        for (String s : map.keySet()) {
//            System.out.println(s);
//        }
//
//        //2.총점, 평균, 최고점수, 최저점수 구현
//        Iterator<Integer> iter = map.values().iterator();
//        int total = 0;
//
//        while (iter.hasNext()){
//            int num = iter.next();
//            total += num;
//        }
//
//        System.out.println("<점수게시판>");
//        System.out.println("총점 : " + total);
//        System.out.println("평균: " + total/3);
//        System.out.println("최고점수: " + Collections.max(map.values()));
//        System.out.println("최저점수: " + Collections.min(map.values()));

    }
}
