package _07_객체지향언어;

public class _11_조상super {
    public static void main(String[] args) {

    }
}

class _11_point{
    int x,y;
    _11_point(){
        this(0, 0);
    }
    _11_point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class _11_point3D extends _11_point{
    int z;
    _11_point3D(){
        this(0, 0, 0);
    }
    _11_point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
}
