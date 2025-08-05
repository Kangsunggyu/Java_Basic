import java.util.Arrays;
import java.util.Scanner;

public class _010_최소값찾기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();         // 전체 수의 개수
        int checkNum = scanner.nextInt();    // 윈도우 크기

        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }

        // i는 현재 위치, 0부터 num까지
        for (int i = 0; i < num; i++) {
            // 슬라이딩 윈도우 시작 지점 계산
            int start = Math.max(0, i - checkNum + 1);
            // i = 0 일때 -2 즉 0, i = 1 일때 0, i = 2 -> 0, i = 3 -> 1, i = 4 -> 2

            // 현재 윈도우 범위 추출
            int[] checkArray = new int[i - start + 1];
            for (int j = 0; j < checkArray.length; j++) {
                checkArray[j] = array[start + j];
            }

            // 현재 윈도우에서 최소값 출력
            System.out.print(Arrays.stream(checkArray).min().getAsInt() + " ");
        }
    }
}
