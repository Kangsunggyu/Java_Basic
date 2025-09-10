import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 버블 sort가 몇번째에서 종료되는가

public class _016_버블정렬프로그램1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 배열의 길이

        Number[] arr = new Number[N]; // number 객체의 배열
        for (int i = 0; i <N ; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = new Number(num, i);
        }

        Arrays.sort(arr); // 여기서 compareTo를 value로 지정했기에 값 기준 오름차순이 된다.

        int answer = 0;
        for (int i = 0; i < N; i++) {
            // 정렬 후 인덱스 i, 원래 인덱스 arr[i].index
            int diff = arr[i].index - i;
            if (diff > answer) {
                answer = diff;
            }
        }
    }
}

class Number implements Comparable<Number>{
    int value; // 값
    int index; // 인덱스

    Number(int value, int index){ // (값, 인덱스)를 가진다.
        this.value = value;
        this.index = index;
    }
    @Override
    public int compareTo(Number o){
        return this.value- o.value; // value 기준 오름차순 정렬
    }
}