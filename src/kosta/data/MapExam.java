package kosta.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        // Map : (key, value), (key, value) => HashMap

        Map<String,String> map = new HashMap<String, String>(); //Map 이라는 인터페이스

        map.put("1", "SSG");
        map.put("2", "키움");
        map.put("3", "LG");

        System.out.println("요소의 사이즈: " + map.size());

        if(map.containsValue("SSG")){
            map.remove("1");
        }

        System.out.println("요소의 사이즈: " + map.size());

        System.out.println(map.get("2")); //일반적인 key 대한 밸류값 얻어오는법
        System.out.println(map.get("3")); //일반적인 key 대한 밸류값 얻어오는법

        // 키값을 몰라도 다 출력하고 싶을 떄, List 는 순서(식당주문했을때 순서처럼)가 있지만 set 과 Map 은 순서와 거리가 멀다 = 복주머니처럼 누가 뽑힐지 모름

        //Map 전체목록 출력(key, value)  (맵은 전체출력 메소드 없음)
        //Map => <Set 으로 변환 후> => Iterator 로
        //<Set 으로 변환>
        //1. key -> keySet() : 키값만 추출
        //2. value -> values() : Collection 으로 해당 value 값만 추출
        //3. entrySet() : Key 와 value  모두 추출

        //3. entrySet() : Key 와 value  모두 추출
        Set set = map.entrySet();
        Iterator iter = set.iterator();

        while (iter.hasNext()){  // 데이터타입 한쌍을 Map.Entry 로 표현
            Map.Entry<String, String> e = (Map.Entry<String, String>)iter.next();  // Entry .이 들어간 내부 클래스구나 ! 내부 인터클래스구나!
            System.out.println("key: " + e.getKey() + ", value: " + e.getValue());
        }


    }
}
