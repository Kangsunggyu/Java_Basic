public class _39_interface_장점 {
    public static void main(String[] args) {
        // 선언(설계)와 구현을 분리할 수 있다.
        // 간접적인 관계를 만들 수 있다.

        _39_A a = new _39_A(); // A 클래스의 객체 생성

        // a.methodA에 B 클래스의 새 객체를 직접 전달합니다.
        // 이는 A와 B가 강하게 연결되어 있음을 보여줍니다.
        a.methodA(new _39_B());
        a.methodA(new _39_C());
    }
}
// class A: 직접적인 관계의 'A' 클래스
class _39_A {
    // methodA는 B 클래스의 객체(b)를 매개변수로 직접 받습니다.
    public void methodA(_39_B b) { // B 클래스의 매개변수
        b.methodB(); // B 클래스의 methodB를 직접 호출
    }
    public void methodA(_39_C c) { // B 클래스의 매개변수
        c.methodC(); // B 클래스의 methodB를 직접 호출
    }
}

// class B: 직접적인 관계의 'B' 클래스
class _39_B {
    // methodB를 가지고 있습니다.
    public void methodB() {
        System.out.println("methodB()");
    }
}
class _39_C{
    public void methodC() {
        System.out.println("methodC() in C"); // B와 다른 구현
    }
}


