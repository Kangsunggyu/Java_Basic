package _11_컬렉션;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _09_ArrayList {
    public static void main(String[] args) {
        // 순서 0 중복 0
        ArrayList<Integer> list = new ArrayList(10);
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(0);
        list.add(1);
        list.add(3);

        ArrayList list2 = new ArrayList(list.subList(1, 4));
        System.out.println(list);
        System.out.println(list2);

        System.out.println("\n정렬");
        Collections.sort(list2);
        System.out.println(list2);

        System.out.println("\n추가");
        list2.add("B");
        list2.add(2, "C");
        System.out.println(list2);

        System.out.println("\n삭제");
        list2.remove(1); // 1번 인덱스를 삭제
        list2.remove(new Integer(4));
        System.out.println(list2);

        System.out.println("\n변경");
        list2.set(1, "WW"); // 1을 WW로 변경
        System.out.println(list2);

        // list에서 list2와 겹치는 부분만 남기고 나머지 삭제
        System.out.println("\n특이한거");
        list.retainAll(list2);
        System.out.println(list);

        // list2에서 list와 겹치는 부분을 삭제
        for(int i= list2.size()-1; i>=0; i--){
            if(list.contains(list2.get(i))){
                list2.remove((i));
            }
        }
        System.out.println(list2);
    }
}
