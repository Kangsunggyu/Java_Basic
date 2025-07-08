public class _40_inferface_장점 {
    public static void main(String[] args) {
        _40_A a = new _40_A(); // A 클래스의 객체 생성

        // a.methodA에 B 클래스의 새 객체를 전달합니다.
        // B는 I를 구현하므로, I 타입으로 취급될 수 있습니다.
        a.methodA(new _40_B()); // "method()" 출력

        // 이제 B가 아닌 C 클래스의 객체를 전달할 수 있습니다.
        // C 또한 I를 구현하므로, A 클래스의 코드를 수정할 필요 없이 다른 구현을 사용할 수 있습니다.
        a.methodA(new _40_C()); // "method() in C" 출력
    }
}
// class A: 간접적인 관계의 'A' 클래스
class _40_A {
    // methodA는 인터페이스 I 타입의 객체(i)를 매개변수로 받습니다.
    // 이는 A가 I 인터페이스를 구현하는 '어떤' 객체와도 상호작용할 수 있음을 의미합니다. (I 사용)
    public void methodA(I i) { // 인터페이스 I를 매개변수로 받음
        i.method(); // 인터페이스 I에 정의된 methodB를 호출
    }
}

// interface I: 간접적인 관계의 'I' 인터페이스
// methodB()라는 하나의 추상 메서드를 정의합니다.
// 이 인터페이스는 'methodB' 기능을 제공하는 모든 클래스의 약속(계약) 역할을 합니다.
interface I { // 인터페이스 정의
    void method();
}

// class B: 간접적인 관계의 'B' 클래스
// I 인터페이스를 구현합니다.
// 이는 B가 I 인터페이스의 모든 추상 메서드를 구현해야 함을 의미합니다.
class _40_B implements I {
    @Override // 인터페이스 메서드를 구현했음을 명시
    public void method() {
        System.out.println("methodB()");
    }
}

// class C: 간접적인 관계의 'C' 클래스
// 마찬가지로 I 인터페이스를 구현합니다.
// 이는 C도 I 인터페이스의 약속을 지키며 methodB()를 구현한다는 의미입니다.
class _40_C implements I {
    @Override // 인터페이스 메서드를 구현했음을 명시
    public void method() {
        System.out.println("methodB() in C"); // B와 다른 구현
    }
}
