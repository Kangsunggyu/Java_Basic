import java.util.stream.Stream;

public class _21_람다식 {
    public static void main(String[] args) {
        Stream<Integer> evenStream = Stream.iterate(0, n->n+2);
        evenStream
                .limit(5)
                .forEach(System.out::println);
    }
}
