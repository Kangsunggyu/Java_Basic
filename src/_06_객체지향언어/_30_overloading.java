package _06_객체지향언어;

public class _30_overloading {
    public static void main(String[] args) {
        // 한 클래스 안에 같은 이름의 메서드 여러 개 정의하는 것
        // 1. 메서드의 이름이 같아야 한다.
        // 2. 매개변수의 개수 또는 타입이 달라야 한다.
        // 3. 봔한 타입은 영향없다.
    }
}
class _30_{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    float add(float a, float b){
        return a+b;
    }
}
