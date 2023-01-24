package bookExam;

import java.util.*;

public class MapMission {
    public static void main(String[] args) {

        //이름, 점수를 한쌍으로 Map 자료구조로 구현하자 => 김자바 : 80, 박자바 : 70
        //1. 시험 응시자만 전체 출력
        //2. 총점, 평균, 최고점수, 최저점수 구현   (Collections => max(), min() 활용해볼라면 해보세용)

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("김자바", 80);
        map.put("손댕", 100);

        Set<String> set = map.keySet();
        System.out.println("<응시자들 목록>");
        System.out.println(set);

        Collection<Integer> values = map.values();
        Iterator<Integer> iter = values.iterator();

        int total = 0;
        while (iter.hasNext()){
            total += iter.next();
        }

        System.out.println("총점" + total);
        System.out.println("평균" + total/map.size());
        System.out.println(Collections.max(values));
        System.out.println(Collections.min(values));








    }
}
