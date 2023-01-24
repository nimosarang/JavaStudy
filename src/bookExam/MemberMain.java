package bookExam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemberMain {
    public static void main(String[] args) {
        //List 생성해서 Member 여러개를 추가하고 전체를 출력하세요

        List<Member> list = new ArrayList<>();

        list.add(new Member("바보", 12, "서울"));
        list.add(new Member("니모", 22, "인천"));
        list.add(new Member("에디", 33, "수원"));


//        System.out.print(list.toString().toString());
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        list.stream().forEach(member ->
//                System.out.println(member.toString())
//        );

        Iterator<Member> iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next().toString());
        }












    }
}
