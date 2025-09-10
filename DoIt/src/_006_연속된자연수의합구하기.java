import java.util.Scanner;

// n이 몇개의 연속된 자연수의 합으로 나타낼 수 있는지에 대한 문제
// 15를 입력하면, 15, 1+2+3+4+5, 4+5+6, 7+8 총 4개이다.
public class _006_연속된자연수의합구하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int count = 1; //  15를 입력했다면 15 그 자체를 1
        int start_index = 1;
        int end_index = 1;
        int sum = 0; // 1+2+3 등등

        while (end_index != i){ // end_index가 15가 아니라면 계속 반복한다.
            if(sum == i){ // 합이 15라면
                count++; // 정확히 15를 맞추었기에 count += 1
                start_index++; // 시작 지점을 하나 늘리고
                end_index = start_index; // 엔드 포인트는 시작 인덱스가 된다.
                sum =0; // 합은 다시 0
            } else if (sum > i) { // 15보다 크니 15가 될 가능성이 없는 실패이다.
                start_index++; // 시작 인덱스를 하나 늘리고
                end_index = start_index; // 엔드 포인트는 시작 인덱스가 된다.
                sum = 0; // 합은 다시 0
            } else{
                sum += end_index; // 15보다 합이 작은 경우
                end_index++;

            }
        }
        System.out.println(count);
    }
}
