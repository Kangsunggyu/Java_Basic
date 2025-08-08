import java.util.PriorityQueue;
import java.util.Scanner;


// PriorityQueue 우선순위 큐 자료구조, 꺼낼 때 항상 우선순위가 높은 값부터 나오는 큐
public class _014_절대값힙구현하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            if (absA == absB) {
                return a - b; // 절댓값 같으면 작은 값 우선
            }else {
                return absA - absB; // 절대값이 다르면 오름차순으로 정렬되도록 배열
            }
             // 절댓값 작은 것 우선
        }); // 오름차순

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x != 0) {
                pq.add(x);
            } else {
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll());
                }
            }
        }
    }
}
