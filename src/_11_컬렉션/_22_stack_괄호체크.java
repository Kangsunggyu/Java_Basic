package _11_컬렉션;

import java.util.Scanner;
import java.util.Stack;

public class _22_stack_괄호체크 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        System.out.println("수학 기호를 입력하시오");
        String get = scanner.nextLine().trim();

        char ch;
        for (int i = 0; i < get.length(); i++) {
            ch = get.charAt(i);
            if(ch == '('){
                st.push('(');
            } else if (ch == ')'){
                st.pop();
            }
        }
        if(st.isEmpty()){
            System.out.println("괄호 일치");
        } else{
            System.out.println("괄호 불일치");
        }


    }
}
