package _14_람다와스트림;

public class _3_람다식_매개변수 {
    public static void main(String[] args) {
        // 1) 익명 클래스
        Calculator calculator = (a, b) -> (a+b);

        cal c = new cal();

        // 2) add 메서드에 인터페이스 전달
        System.out.println(c.add(2, 4, calculator)); // 6

        // 3) 람다식 직접 전달
        System.out.println(c.add(3, 7, (x, y) -> x + y)); // 10

        // 4) car 필드 지정 후 car2 람다 실행
        c.car = calculator;
        System.out.println(c.car2.sum(5, 5)); // 10

        // 5) car2 람다를 직접 새로 정의해서 실행
        Calculator customLambda = (a, b) -> a * b;
        System.out.println(customLambda.sum(2, 5)); // 10
    }
}

class cal implements Calculator {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    int add(int a, int b, Calculator cal) {
        return cal.sum(a, b);
    }

    Calculator car; // 필드
    Calculator car2 = (a, b) -> car.sum(a, b); // car가 null이면 NullPointerException!
}
