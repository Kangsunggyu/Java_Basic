// 2차원 배열의 구간합 공식
import java.util.Scanner;
public class _004_구간합구하기2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();       // 배열 크기
        int calculatorNum = scanner.nextInt(); // 질의 개수

        int[][] array = new int[length + 1][length + 1]; // 0, 0은 0으로 비워두고 사용하지 않음 
        int[][] sumArray = new int[length + 1][length + 1];

        // 입력 및 누적합 배열 생성
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                array[i][j] = scanner.nextInt();
                sumArray[i][j] = sumArray[i - 1][j] + sumArray[i][j - 1]
                        - sumArray[i - 1][j - 1] + array[i][j];
            }
        }

        for (int i = 0; i < calculatorNum; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            int result = sumArray[x2][y2]
                    - sumArray[x1 - 1][y2]
                    - sumArray[x2][y1 - 1]
                    + sumArray[x1 - 1][y1 - 1];

            System.out.println(result);
        }
    }
}
