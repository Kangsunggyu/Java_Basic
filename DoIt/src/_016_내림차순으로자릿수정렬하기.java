import java.util.Scanner;

public class _016_내림차순으로자릿수정렬하기 {
    public static void main(String[] args) {
        // 버블정렬 사용하기
        // 연속된 숫자로 받기 12345 이런식으로 
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int[] array = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = Integer.parseInt(str.substring(i, i+1)); // 문자열을 숫자로 바꾸기
        }
        for (int i = 0; i < array.length-1 ; i++) {
            for (int j = 0; j < array.length-1 - i; j++) {
                if(array[j] < array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
