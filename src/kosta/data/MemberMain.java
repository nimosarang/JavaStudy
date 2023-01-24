package kosta.data;

import java.util.*;

public class MemberMain {
    public static void main(String[] args) {
        // List 생성해서 Member 여러개를 추가하고 전체를 출력하세요

        List<Member> list = new ArrayList<>();

        list.add(new Member("박길동", 30, "우리집"));
        list.add(new Member("홍길동", 20, "화성"));
        list.add(new Member("김길다", 10, "수원"));

//        for (int i = 0; i < list.size(); i++) {
//            Member m = list.get(i);
//            System.out.println(m.toString());
//        }

//        for (Member m : list){
//            System.out.print(m.getName());
        //           =>한줄로 줄이면 list.get(i).getName();
//        }
//
//        Iterator<Member> iter = list.iterator();
//        while (iter.hasNext()){ //안에 값이 있나요~?
//            Member m = iter.next();//멤버 캑체 하나씩 끄집어냄
//            System.out.print(m.getName());
//        }
//

        Collections.sort(list, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                //이름을 기준으로 오름차순 만들기
                //compareTo
                //0 -> 서로같다
                //음수 -> ex) aa.compareTo(BB) aa가 작음
                //양수 -> ex) BB.compareTo(AA) BB가 큼

                if (o1.getName().compareTo(o2.getName()) > 0) {  // 조건>0, 이것은 양수 , 앞놈이 더 크다
                    return 1; // 자리를 바꿔야 오름차순
                } else if (o1.getName().compareTo(o2.getName()) < 0) {
                    return -1;
                }
                return 0;
            }

        }); //정렬이 안되어있는 상태, 최초의 정렬 기준을 만든다! Comparable // 오버라이딩 수정 후 나이 기준으로 오름차순됨

        list.stream().forEach(Member ->
//                System.out.println(Member.getName())
                        System.out.println(Member)
        );


    }

}

