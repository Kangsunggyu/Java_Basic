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
/*
import java.util.Scanner;

public class _018_ATM인출시간계산하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] needTime = new int[length];

        for (int i = 0; i < length; i++) {
            needTime[i] = scanner.nextInt();
        }

        // 삽입 정렬 (오름차순)
        for (int i = 1; i < length; i++) {
            int insertValue = needTime[i];
            int j = i - 1;

            while (j >= 0 && needTime[j] > insertValue) {
                needTime[j + 1] = needTime[j]; // 오른쪽으로 밀기
                j--;
            }
            needTime[j + 1] = insertValue; // 알맞은 자리에 삽입
        }

        int sum = 0;        // 전체 시간 합
        int prefixSum = 0;  // 누적 합

        for (int i = 0; i < length; i++) {
            prefixSum += needTime[i];
            sum += prefixSum;
        }

        System.out.println(sum);
    }
}

*/