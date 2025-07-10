import java.util.stream.Stream;

public class _16_정리 {
    public static void main(String[] args) {
        String[] strArr = {"dd", "aaa","CCc", "b", "b"};

        // 1) filter + distinct + sorted + limit + count 한 번에 연결
        long total = Stream.of(strArr)
                .filter(s -> s.length() > 2)
                .distinct()
                .sorted()
                .limit(5)
                .count(); // 매개변수 없음!

        System.out.println("총 개수 = " + total);

        // 2) forEach로 출력
        Stream.of(strArr)
                .filter(s -> s.length() > 2)
                .distinct()
                .sorted()
                .limit(5)
                .forEach(System.out::println);
    }
}
