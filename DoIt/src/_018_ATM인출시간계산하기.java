import java.util.Scanner;

public class _018_ATM인출시간계산하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] needTime = new int[length];
        int[] needAllTime = new int[length];

        for (int i = 0; i <length ; i++) {
            needTime[i] = scanner.nextInt();
        }

        for (int i = 1; i < length; i++) {
            int insertPoint = i;
            int insertValue = needAllTime[i];
            for (int j = i-1; j >=0 ; j--) {
                if(needAllTime[j] < needAllTime[i]){
                    insertPoint = j+1;
                    break;
                }
            }
        }
    }
}
