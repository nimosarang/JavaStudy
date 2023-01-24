package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); //ArrayList 생성

        list.add("사과");
        list.add("포도");
        list.add("수박");

        //데이터값을 뽑는 방법1
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));

        //데이터값을 뽑는 방법2
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }



    }

}
