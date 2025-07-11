package _07_객체지향언어;

public class _26_instanceof {
    public static void main(String[] args) {

        _24_smartTv s = new _24_smartTv(); // 기본

        _24_TV t = (_24_TV) s; // 업캐스팅 즉 자손타입에서 조상타입으로 형변환, 업캐스팅은 문제가 발생하지 않음


        // 다운 캐스팅은 문제가 발생할 수 있기에 instanceof를 사용한다.
        if (t instanceof _24_smartTv) {
            _24_smartTv s2 = (_24_smartTv) t; // 안전한 다운캐스팅
            System.out.println("다운캐스팅 성공: " + s2.text);
        }

        _24_TV t2 = new _24_TV();
        if (t2 instanceof _24_smartTv) {
            _24_smartTv s3 = (_24_smartTv) t2; // 실행되지 않음
        } else {
            System.out.println("t2는 실제로 _24_smartTv가 아닙니다! 다운캐스팅 불가!");
        }
    }
}

