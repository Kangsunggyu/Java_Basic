import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 카드가 1장 남을 때까지 반복한다.
// 가장 위에서부터 1, 2, 3, 4라고 했을 때, 1을 버리고, 2를 가장 아래로 내린다. 3, 4, 2 이렇게 이걸 계속 반복한다.

public class _013_카드게임 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n = scanner.nextInt();

        for (int i = 1; i <= n ; i++) {
            queue.add(i);
        }

        while (queue.size() > 1){
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());
    }
}
