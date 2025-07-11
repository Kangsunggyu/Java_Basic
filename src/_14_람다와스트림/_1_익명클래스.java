package _14_람다와스트림;

public class _1_익명클래스 {
    public static void main(String[] args) {
        // 익명클래스: 이름이 없는 클래스
        // 별도의 클래스 파일을 만들지 않고, 코드 내에서 일회성으로 정의해 사용하는 것
        // 인터페이스, 클래스(일반, 추상)의 구현과 상속을 활용해 익명 클래스를 구현할 수 있다.
        // 람다에서는 인터페이스를 사용한 익명 클래스가 활용된다

        Calculator cal = new Calculator() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        int ret = cal.sum(2, 2);
        System.out.println(ret);

    }
}
interface Calculator{
    int sum(int a, int b);
}
