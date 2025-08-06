import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class _012_오큰수구하기 {
    public static void main(String[] args) {
        //오큰수란 a[i] 번째 수보다 오른쪽에 있는 a[i]보다 큰 수이며 가장 왼쪽인 수이다. 없으면 -1
        // [3, 1, 2, 6, 7, 4]  a[2]의 오큰수 6, a[0]의 오큰수 6, a[4]의 오큰수 -1

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < length; i++) {
            int check = 0;
            for (int j = i+1; j <length ; j++) {
                if(array[i] <array[j]){
                    System.out.println(array[j]);
                    check++;
                    break;
                }
            }
            if(check == 0){
                System.out.println(-1);
            }
        }
        //////////////////////////////

        int[] result = new int[length];
        Stack<Integer> stack = new Stack<>();

        stack.push(0); // 초기 스택에 첫 번째 요소의 인덱스를 삽입 안하면 peak 못씀
        for (int i = 1; i < length; i++) {
            // 스택이 비어있지 않고, 현재 요소가 스택 top의 요소보다 클 경우
            while (!stack.isEmpty() && array[stack.peek()] < array[i]){
                result[stack.pop()] = array[i];
            }
            // 오큰수가 아니라면 계속해서 스택에 값을 넣음
            stack.push(i);
        }
        while (!stack.empty()) {
            // 오큰수가 없으므로 -1을 지정
            result[stack.pop()] = -1;
        }
        for (int i = 0; i < length; i++) {
            System.out.println(result[i]);
        }
    }
}
