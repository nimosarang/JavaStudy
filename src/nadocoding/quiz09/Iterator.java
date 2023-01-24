package nadocoding.quiz09;

import java.util.*;

public class Iterator {
    public static void main(String[] args) {
        //이터레이터 : 데이터를 순회함 맨앞부터 커서를 한칸씩 이동하며 해당위치들 글자 가져오는 느낌 이.터.레.이.터
        //리스트나 세트 등에서 가져옴

        List<String> list = new ArrayList<>(); //List 는 인터페이스, 다형성으로 인해 생성 가능
        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        for(String s : list){
            System.out.println(s);
        }
        System.out.println("--------------------");

        java.util.Iterator<String> iterator = list.iterator(); //command+alt+v 자동완성
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        System.out.println("--------------------");
        iterator = list.iterator(); //커서를 처음 위치로 이동
        while (iterator.hasNext()){ //다음에 가져올 데이터가 있는지 반환 있다면 트루
            System.out.println(iterator.next());
        }
        System.out.println("--------------------");
        iterator = list.iterator();
        while (iterator.hasNext()){
            String s = iterator.next(); //유재석
            if (s.contains("(알 수 없음)")){
                iterator.remove();
            }
        }
        iterator = list.iterator(); //커서를 처음 위치로 이동
        while (iterator.hasNext()){ //다음에 가져올 데이터가 있는지 반환 있다면 트루
            System.out.println(iterator.next());
        }
        System.out.println("--------------------");

        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        java.util.Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()){
            System.out.println(itSet.next());
        }
        System.out.println("----------------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

        // map.iterator() // 제공되지 않음
        java.util.Iterator<String> itMapKey = set.iterator();
        while (itMapKey.hasNext()){
            System.out.println(itMapKey.next());
        }
        System.out.println("------------------------------");

        java.util.Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while(itMap.hasNext()){
            System.out.println(itMap.next());
        }

    }
}
