import java.util.*;

public class _49_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();
        hm.put("강", 54);
        hm.put("김", 99);
        hm.put("교", 23);
        hm.put("모", 93);

        Collection<Integer> c = hm.values();

        // 가장 높은 점수 낮은 점수
        System.out.println("가장 높은 점수: " + Collections.max(c));
        System.out.println("가장 낮은 점수: " + Collections.min(c));

        System.out.println("명단: " + hm.keySet() );

        //총점
        int total = 0, i;
        Iterator<Integer> it = hm.values().iterator();
        while(it.hasNext()){
            i = it.next();
            total+= i;
        }
        System.out.println(total);


    }
}
