public class _11_선언위치에_따른_변수종류 {
    public static void main(String[] args) {
        _11_Card c = new _11_Card();
        c.kind = "HEART";
        c.number = 5;

        _11_Card.height = 200;
        _11_Card.width = 100;

        int k = c.method(2, 5);
        System.out.println(k);
    }
}

class _11_Card{ // 클래스 영역
    // 인스턴스 변수  /  객체 생성 필요  /  개별적이어야 하는 것
    int number;
    String kind;

    // 클래스 변수(static 변수, 공유 변수)  /  객체 생성 필요없다.  / 공통적이어야 하는 것
    static int width = 100;
    static int height = 250;

    int method(int x, int y){ // 메서드 영역 // 지역변수
        int z = x + y; // 지역변수
        return z;
    }
}
