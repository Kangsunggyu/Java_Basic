import java.util.Scanner;

public class _016_내림차순으로자릿수정렬하기 {
    public static void main(String[] args) {
        // 선택정렬 사용하기
        // 연속된 숫자로 받기 12345 이런식으로 
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int[] array = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = Integer.parseInt(str.substring(i, i+1)); // 문자열을 숫자로 바꾸기
        }

        for (int i = 0; i < array.length-1 ; i++) {
            int max = i;
            for (int j= i+1; j < array.length; j++) {
                if(array[j] > array[max]){
                    max = j;
                }
            }
            if(array[i]< array[max]){
                int tmp = array[max];
                array[max] = array[i];
                array[i]= tmp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
