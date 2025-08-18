import java.util.Scanner;

public class _015_수정렬하기 {
    public static void main(String[] args) {
        // 버블정렬로 사용자가 입력한 수(개수)를 정렬하기
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length-1-i; j++) {
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i <length ; i++) {
            System.out.println(array[i]);
        }
    }
}
