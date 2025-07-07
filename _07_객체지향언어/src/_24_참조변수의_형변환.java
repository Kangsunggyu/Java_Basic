public class _24_참조변수의_형변환 {
    public static void main(String[] args) {
        // 자손 타입 변수 s : smartTv의 모든 멤버 사용 가능
        _24_smartTv s = new _24_smartTv();
        s.text = "Hello, Smart TV!";
        s.channel = 5;
        System.out.println("s.text = " + s.text); // 자손 멤버 접근 가능
        System.out.println("s.channel = " + s.channel); // 부모 멤버 접근 가능

        // 업캐스팅: 자손 타입 → 부모 타입
        _24_TV t = (_24_TV) s; // 실제 객체는 smartTv지만 참조형은 TV 타입
        System.out.println("\n=== 업캐스팅 후 ===");
        System.out.println("t.channel = " + t.channel); // 부모 멤버 접근 가능

        // System.out.println(t.text); // 오류! 조상 타입으로는 자손 멤버 접근 불가

        // 다운캐스팅: 부모 타입 → 자손 타입
        _24_smartTv s2 = (_24_smartTv) t; // 실제 객체가 smartTv라서 안전
        System.out.println("\n=== 다운캐스팅 후 ===");
        System.out.println("s2.text = " + s2.text); // 자손 멤버 다시 접근 가능
        System.out.println("s2.channel = " + s2.channel); // 부모 멤버도 접근 가능

        // 자손끼리 형변환 불가 예시
        //_24_smartTv s3 = (_24_smartTv) new _24_TV(); // 런타임 오류! 부모 객체는 자손으로 캐스팅 불가

        // 안전한 다운캐스팅 예시
        if (t instanceof _24_smartTv) {
            _24_smartTv s4 = (_24_smartTv) t;
            System.out.println("\n=== instanceof 체크 후 안전한 다운캐스팅 ===");
            System.out.println("s4.text = " + s4.text);
        }
    }
}

class _24_TV {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

class _24_smartTv extends _24_TV {
    String text;
}
