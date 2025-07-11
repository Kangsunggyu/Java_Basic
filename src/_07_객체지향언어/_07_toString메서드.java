package _07_객체지향언어;

public class _07_toString메서드 {
    public static void main(String[] args) {
        _07_circle c = new _07_circle();
        c.r = 5;  // 반지름 값 설정

        System.out.println(c.toString()); // 명시적 호출
        System.out.println(c);            // println 내부에서 자동으로 toString() 호출됨
    }
}


class _07_point3D {
    int x = 1;
    int y = 2;
    int z = 3;

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }
}
class _07_circle extends Object {
    _07_point3D p = new _07_point3D();
    int r;

    // toString() 오버라이딩
    @Override
    public String toString() {
        return "Circle [center=" + p + ", radius=" + r + "]";
    }
}
