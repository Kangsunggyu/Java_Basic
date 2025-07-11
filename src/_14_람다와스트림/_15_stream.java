package _14_람다와스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _15_stream {
    public static void main(String[] args) {
        // 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> intStream = list.stream();

        Stream<String> strStream = Stream.of(new String[]{"a", "b", "c"}); // Stream.of: 배열, 가변인자에서 Stream 생성
        Stream<Integer> evenStream  = Stream.iterate(0, n->n+2); // 무한 Stream. 0부터 시작해서 2씩 증가.
        Stream<Double> randomStream = Stream.generate(Math::random); //무한 Stream. Supplier로 값 생성.
        IntStream intStream1 = new Random().ints(5); // 난수 Stream. 여기서는 5개 랜덤 int 값.


        // 스트림이 제공하는 기능 - 중간 연산과 최종연산
        // 중간 연산: 연산 결과가 스트림인 연산, 반복적으로 적용가능
        // 연산 결과가 스트림이 아닌 연산, 단 한번만 적용가능

        String[] strArr = {"dd", "aaa","CC", "b", "b"};
        Stream<String> stream = Stream.of(strArr); // 문자열 배열이 소스인 스트림
        Stream<String> filteredStream = stream.filter(s -> s.length() > 2); // 걸러내기(중간 연산) 길이가 2보다 큰 문자열만 필터링
        Stream<String> distinctedStream = stream.distinct(); // 중복제거(중간 연산)
        Stream<String> sortedStream = stream.sorted(); //정렬(중간연산)
        Stream<String> limitedStream = stream.limit(5);

    }
}
