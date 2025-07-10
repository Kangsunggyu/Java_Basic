import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _18_활용 {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5);

        // 원본 스트림 생성
        Stream<Integer> integerStream = arrayList.stream();

        // 1) 중간 연산: 각 숫자를 10배로 만들기
        // 2) 최종 연산: 결과를 출력
        integerStream
                .map(num -> num * 10)
                .forEach(System.out::println);

        // 스트림은 1회용이므로 다시 생성
        List<Integer> arrayList1 = arrayList.stream()
                .map(num -> num * 10)
                .collect(Collectors.toList()); // 최종연산 결과를 원하는 형태로 수집

        System.out.println("새로운 List: " + arrayList1);
    }
}
