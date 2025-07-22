// N개의 숫자가 공백 없이 써있다. 이 숫자를 모두 합해 출력하는 프로그램 작성하시오
// 첫번째에는 자리수를
// 두번째에는 그에 맞는 숫자를

import java.util.Scanner;

public class _001_숫자의합구하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, sum=0;

        // 내가 푼 것
        num1 = scanner.nextInt();
        scanner.nextLine();
        num2 = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num1; i++) {
            sum += num2%10;
            num2 = num2/10;
        }
        System.out.println(sum);



        // 책이 푼 것
        num1 = scanner.nextInt();
        String sNum = scanner.next();
        char[] cNum = sNum.toCharArray(); // ['1', '3'] 이런식으로

        sum = 0;
        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0'; // 아스키 코드를 빼는 것, 즉 '1' - '0' = 49 - 48 같이 작동
        }
        System.out.println(sum);
    }
}
