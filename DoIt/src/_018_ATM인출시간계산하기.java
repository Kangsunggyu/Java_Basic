import java.util.Arrays;
import java.util.Scanner;

public class _018_ATM인출시간계산하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] needTime = new int[length];

        for (int i = 0; i < length; i++) {
            needTime[i] = scanner.nextInt();
        }

        // 시간 오름차순 정렬
        Arrays.sort(needTime);

        int sum = 0;        // 전체 시간 합
        int prefixSum = 0;  // 누적 합

        for (int i = 0; i < length; i++) {
            prefixSum += needTime[i];
            sum += prefixSum;
        }

        System.out.println(sum);
    }
}
