package _11_컬렉션;

import java.util.Queue;
import java.util.Stack;

public class _20_stack {
    public static void main(String[] args) {
        Stack<String> st = new Stack();

        System.out.println("추가");
        st.push("0");
        st.push("1");
        st.push("2");
        System.out.println(st);

        System.out.println("\n삭제");
        st.pop();
        System.out.println(st);

        System.out.println("\nwhile");
        while (!st.empty()){
            System.out.println(st.pop());
        }
    }
}
