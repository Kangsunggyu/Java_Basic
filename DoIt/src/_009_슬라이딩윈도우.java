import java.util.Scanner;

// a


public class _009_슬라이딩윈도우 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt(); // dna의 길이
        int length = scanner.nextInt(); // dna에서 뽑을 비밀번호의 길이
        scanner.nextLine();
        String line = scanner.nextLine().trim();  // 한 줄 입력 받고 공백 제거
        char[] arrayDna = line.toCharArray();     // 문자열을 문자 배열로 변환

        int[] getDNANum = new int[4]; // [a, c, g, t] 중 최소한으로 들어가야하는 수
        for (int i = 0; i < 4; i++) {
            getDNANum[i] = scanner.nextInt();
        }

        int answer = 0;
        for (int i = 0; i < num - length + 1; i++) {
            int successNum = 0;
            int[] danNum = new int[4];
            for (int j = 0; j < length; j++) {
                if (arrayDna[i + j] == 'A') {
                    ++danNum[0];
                } else if (arrayDna[i + j] == 'C') {
                    ++danNum[1];
                } else if (arrayDna[i + j] == 'G') {
                    ++danNum[2];
                } else if (arrayDna[i + j] =='T') {
                    ++danNum[3];
                }
            }
            for (int j = 0; j < 4; j++) {
                if(getDNANum[j] <= danNum[j]){
                    ++successNum;
                }
            }
            if(successNum == 4 ){
                ++answer;
            }

        }
        System.out.println(answer);
    }
}
