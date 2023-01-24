package bookExam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();
        LinkedList<Integer> queue = new LinkedList<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);


        System.out.println("stack");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        System.out.println("Queqe");
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }





    }
}
