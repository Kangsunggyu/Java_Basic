package _11_컬렉션;

import java.util.LinkedList;
import java.util.Queue;

public class _21_Queue {
    public static void main(String[] args) {
        Queue q = new LinkedList();

        System.out.println("추가");
        q.offer("0");
        q.offer("1");
        q.offer("2");
        System.out.println(q);

        System.out.println("\n삭제");
        while (!q.isEmpty()){
            System.out.println(q.poll());
        }


    }
}
