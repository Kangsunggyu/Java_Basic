import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
수 n개가 주어졌을 대 i번부터 j번까지의 합을 구하는 프로그램을 작성
구간합 공식과 배열합 공식을 사용

*/
public class _003_구간합구하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dataCount = scanner.nextInt();
        int queryCount = scanner.nextInt();

        List<Integer> list= new ArrayList<>();
        list.add(0);  // 0번 인덱스: 합이 0인 기본값 이것을 사용해 쉽게 문제를 풀 수 있었다.

        int sum = 0;
        for (int i = 0; i < dataCount; i++) {
            int num = scanner.nextInt();
            sum += num;
            list.add(sum);  // i+1 위치에 누적합 저장
        }
        for (int i = 0; i < queryCount; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int rangeSum = list.get(end) - list.get(start - 1);
            System.out.println(rangeSum);
        }

    }
}
