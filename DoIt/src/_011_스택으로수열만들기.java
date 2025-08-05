import java.util.Scanner;
import java.util.Stack;

public class _011_스택으로수열만들기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] array = new int[num];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <num ; i++) {
            array[i] = scanner.nextInt();
        }

        int st = 1; // 오름차순
        for (int i = 0; i < num; i++) {
            while (st <= array[i]){
                stack.push(st++);
                System.out.println("+");
            }
            if(array[i] == stack.peek() && !stack.isEmpty()){
                stack.pop();
                System.out.println("-");
            }else{
                System.out.println("no");
                break;
            }
        }
    }
}
