package _11_컬렉션;

import java.util.ArrayList;
import java.util.Iterator;

public class _22_iterator {
    public static void main(String[] args) {
        // 컬렉션(리스트, 집합 등)을 하나씩 안전하고 순서 있게 꺼내 쓰게 해주는 반복자 도구
        // 일회용으로 한번 while 돌리면 다시 안된다.

        // ArrayList 생성
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Iterator 생성
        Iterator<String> it = fruits.iterator();

        // 요소 순회
        while (it.hasNext()) {
            String fruit = it.next();
            System.out.println(fruit);
        }

        while (it.hasNext()) {
            String fruit = it.next();
            System.out.println(fruit);
        }
    }
}
