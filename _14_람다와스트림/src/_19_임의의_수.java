import java.util.Random;
import java.util.stream.IntStream;

public class _19_임의의_수 {
    public static void main(String[] args) {
        IntStream intStream = new Random().ints(5, 10); // int만 다루는 stream
        intStream
                .limit(10)
                .forEach(System.out::println);
    }
}
