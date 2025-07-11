package _12_제네릭스;

import java.util.ArrayList;
import java.util.Iterator;

public class _6_iterator {
    public static void main(String[] args) {
        ArrayList<_6_Student> list = new ArrayList<>();
        list.add(new _6_Student("강", 1, 1));
        list.add(new _6_Student("김", 2, 1));
        list.add(new _6_Student("김", 3, 1));

        Iterator<_6_Student> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next().name);

        }
    }
}
class _6_Student{
    String name;
    int number;
    int student_class;
    _6_Student(){}
    _6_Student(String name, int number, int student_class){
        this.name = name;
        this.number = number;
        this.student_class = student_class;
    }
}