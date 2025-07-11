package _14_람다와스트림;

import java.util.Comparator;
import java.util.stream.Stream;

public class _24_활용 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("강", 1, 12),
                new Student("교", 1, 232),
                new Student("김", 2, 90)
        );

        // 최종 연산: forEach로 출력
        studentStream
                .sorted(Comparator.comparingInt(Student::getTotalScore).reversed())
                // Comparator.comparingInt → 정수(int) 값을 기준으로 정렬하는 Comparator를 만듬
                // (Student::getTotalScore) → Student 객체에서 getTotalScore() 메서드를 호출해서 비교할 값을 가져옵니다.
                .forEach(s -> System.out.println(s));
    }
}

class Student {
    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore; // 올바르게 필드 할당
    }
    public int getTotalScore() {
        return totalScore;
    }
    @Override
    public String toString() {
        return String.format("이름: %s, 반: %d, 총점: %d", name, ban, totalScore);
    }
}
