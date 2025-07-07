public class _03_포함 {
    public static void main(String[] args) {
        // 상속관계 a는 b이다.  /  원은 점이다. x
        // 포함관계 a는 b를 가지고 있다.  / 원은 점을 가지고 있다. o
        _03_Circle c = new _03_Circle();
        c.p.y = 20;  // 포함
        c.r = 2;
    }
}
class _03_Circle{
    _01_point3D p = new _01_point3D();
    int r; // 반지름

}
