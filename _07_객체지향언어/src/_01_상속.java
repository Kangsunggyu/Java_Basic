public class _01_상속 {
    public static void main(String[] args) {
        _01_point3D p = new _01_point3D();
        p.x = 20;
        p.y = 10;
        p.z = 30;
    }
}
class _01_point{
    int x;
    int y;
}
class _01_point3D extends _01_point{
    int z;
}