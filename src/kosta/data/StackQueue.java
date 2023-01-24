package kosta.data;

import java.util.LinkedList;
import java.util.Stack;

public class StackQueue {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<Integer>(); //Stack 자료구조 생성
        LinkedList<Integer> q = new LinkedList<Integer>(); //Queue 자료구조 생성 (링크드이용, 메소드를 잘 쓰면됨)

        s.push(1);
        s.push(2);
        s.push(3);

        q.offer(1);
        q.offer(2);
        q.offer(3);

        System.out.println("------Stack------");  // push & pop
        while (!s.isEmpty()){ //비워져있지않으면
            System.out.println(s.pop()); // pop 함수 :젤 마지막에 넣은 것 부터 하나씩 하나씩 뽑아냄
        }

        System.out.println("------Queue------"); // offer & poll
        while (!q.isEmpty()){
            System.out.println(q.poll()); // poll 함수
        }






    }
}
