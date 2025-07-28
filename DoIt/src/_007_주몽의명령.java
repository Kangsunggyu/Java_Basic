import java.util.*;

//투 포인터 알고리즘을 활용하여, 두 수의 합이 특정 값(want)이 되는 경우의 수를 구하는 프로그램

//정수 n개가 주어지고
// 두 수를 골라서 그 합이 want가 되는 쌍의 개수를 구하는 것
// 한번 사용한 값은 다시 사용 못함

public class _007_주몽의명령 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int want = scanner.nextInt();

        int k;
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();

        }

        Arrays.sort(list);

        int first = 0;
        int last = n-1;
        int count = 0;
        while (first<last){
            if( (list[first] + list[last]) == want){
                count++;
                first++;
                last--;
            } else if((list[first] + list[last]) < want){
                first++;
            } else{
                last--;
            }
        }
        System.out.println(count);
    }
}
