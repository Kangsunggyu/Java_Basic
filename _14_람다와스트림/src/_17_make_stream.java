import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _17_make_stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> integerSteam = list.stream();
        integerSteam.forEach(System.out::println);
        System.out.println(


        );
        String[] strArr = {"a", "b", "c", "d"};
        Stream<String> stringStream = Stream.of(strArr);
        System.out.println(stringStream.count());

        // 두 줄을 한줄로 줄인것
        Stream<String> stringStream2 = Stream.of(new String[]{"a", "b", "c", "d"} );
        stringStream2.forEach(System.out::println);

    }
}
