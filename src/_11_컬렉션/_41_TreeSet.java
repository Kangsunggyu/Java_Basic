package _11_컬렉션;

import java.util.Set;
import java.util.TreeSet;

public class _41_TreeSet {
    public static void main(String[] args) {
        // 부모노드 왼쪽에는 부모노드보다 값이 작은 값을 오른쪽에는 큰 값의 자식을 넣는 트리구조
        // 중복값은 저장되지 않는 hashset을 통해 중복값이 없는 로또번호 만들기
        TreeSet<Integer> set = new TreeSet<>();
        int [] score= {80, 95, 50, 35, 45, 65, 10, 100};
        for (int i = 0; i < score.length; i++) {
            set.add(new Integer(score[i]));
        }
        System.out.println("80보다 작은 값: " + set.headSet(new Integer(80)));
        System.out.println("80보다 큰 값: " + set.tailSet(new Integer(80)));
    }
}
