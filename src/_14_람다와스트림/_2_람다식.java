package _14_람다와스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2_람다식 {
    public static void main(String[] args) {
        Calculator cal = new Calculator() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        Calculator cal2 = (a, b) -> (a+b);
        System.out.println(cal2.sum(2, 4));




        //----------------------------------------------------\

        Square square = (num) -> num * num;
        int result = square.apply(6);
        System.out.println(result);

        List<String> names = new ArrayList<>(Arrays.asList("홍길동", "이순신", "강감찬"));

        // 조건: '이'로 시작하는 이름만 출력
        Filter filter = (s) -> s.startsWith("이");

        for (String name : names) {
            if (filter.check(name)) {
                System.out.println(name); // 이순신만 출력됨
            }
        }


    }

}
interface Square{
    int apply(int x);
}

interface Filter {
    boolean check(String s);
}

