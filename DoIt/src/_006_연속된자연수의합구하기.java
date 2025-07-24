import java.util.Scanner;

// n이 몇개의 연속된 자연수의 합으로 나타낼 수 있는지에 대한 문제
// 15를 입력하면, 15, 1+2+3+4+5, 4+5+6, 7+8 총 4개이다.
public class _006_연속된자연수의합구하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 0;

        while (end_index != i){
            if(sum == i){
                count++;
                start_index++;
                end_index = start_index;
                sum =0;
            } else if (sum > i) {
                start_index++;
                end_index = start_index;
                sum = 0;
            } else{
                sum += end_index;
                end_index++;

            }
        }
        System.out.println(count);
    }
}
