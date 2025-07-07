public class _32_생성자 {
    public static void main(String[] args) {
        // 인스턴스가 생성될 때, 인스턴스 초기화 메서드
        _32_car c = new _32_car();
        _32_car c2 = new _32_car("blue", 4, 4);

    }
}
class _32_car{
    String color;
    int door;
    int seat;

    _32_car(){}
    _32_car(String color, int door, int seat){
        this.color = color;
        this.door = door;
        this.seat = seat;
    }

}