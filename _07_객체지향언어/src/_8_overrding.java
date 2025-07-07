public class _8_overrding {
    public static void main(String[] args) {
        //  상속받은 조상의 메서드를 자신에 맞게 변경하는 것
    }
}
class _8_Point{
    int x;
    int y;
    _8_Point(){}
    _8_Point(int x, int y){
        this.x = 3;
        this.y = 2;
    }
    String getLocation(){
        return (x +", "+ y);
    }


}
class _8_Print3D extends _8_Point{
    int z;
    String getLocation(){ // 오버라이딩
        return (x +", "+ y + ", " + z);
    }
}