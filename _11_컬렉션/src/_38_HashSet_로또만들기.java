import java.util.HashSet;
import java.util.Set;

public class _38_HashSet_로또만들기 {
    public static void main(String[] args) {
        // 중복값은 저장되지 않는 hashset을 통해 중복값이 없는 로또번호 만들기

        Set<Integer> set = new HashSet<>();
        while (set.size() < 6){
            int num = (int)(Math.random()*45) + 1;  //1 <= num <= 45
            set.add(num);
        }
        System.out.println(set);
    }
}
