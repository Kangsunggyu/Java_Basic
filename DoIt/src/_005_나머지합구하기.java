import java.util.Scanner;

public class _005_나머지합구하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 수열의 길이
        int k = scanner.nextInt(); // 나눌 값

        int answer = 0;
        int[] adder = new int[n];
        int[] remainderNum = new int[k]; // 나머지별 개수를 저장할 배열, 나머지 1이 몇개인지
        int sum = 0;

        adder[0] = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            adder[i] = adder[i-1] + scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int remainder = adder[i]%k;
            remainderNum[remainder]++; // 배열 0에는 나머지가 0인 개수, 배열 1에는 나머지가 1인 개수
            if(remainder == 0 ){
                answer++;
            }
        }
        for (int i = 0; i < k; i++) {
            if(remainderNum[i]> 1){
                answer += remainderNum[i] * (remainderNum[i] - 1) / 2;
            }
        }
        System.out.println(answer);
    }
}
