package _11_컬렉션;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class _연습문제_1_학생정리 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("홍길동", 2, 1, 90, 80, 70));
        list.add(new Student("김철수", 2, 2, 85, 90, 80));
        list.add(new Student("이영희", 1, 3, 75, 85, 90));
        list.add(new Student("박영수", 1, 1, 95, 100, 90));
        list.add(new Student("박영수", 1, 2, 95, 100, 90));
        // 정렬
        Collections.sort(list, new Student.ClassList());

        for (Student s : list) {
            System.out.println(s);
        }
    }
}

class Student {
    String name;
    int classNumber;
    int number;
    int kor;
    int eng;
    int math;

    Student() {}
    Student(String name, int classNumber, int number, int kor, int eng, int math) {
        this.name = name;
        this.classNumber = classNumber;
        this.number = number;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    double getAverage() {
        return (kor + eng + math) / 3.0;
    }

    @Override
    public String toString() {
        return name + ", " + classNumber + ", " + number + ", " + kor + ", " + eng + ", " + math;
    }

    // 정렬 기준: 반 오름차순 -> 번호 오름차순
    static class ClassList implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) { // 정렬하는 메서드
            if (s1.classNumber != s2.classNumber) { // 반 번호가 다르면
                return s1.classNumber - s2.classNumber; // 반 번호로 정렬하고
            } else {
                return s1.number - s2.number; // 반 번호가 같으면 학생 번호로 정렬한다.
            }
        }
    }
}
