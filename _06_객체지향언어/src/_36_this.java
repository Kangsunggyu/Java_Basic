public class _36_this {
    public static void main(String[] args) {
        // 인스턴스가 생성될 때, 인스턴스 초기화 메서드
        _33_car c = new _33_car();
        _33_car c2 = new _33_car("blue", 4, 4);

    }
}
class _33_car{
    String color;
    int door;
    int seat;

    _33_car(){
        this("red", 2, 3); // 초기화 할때 간편하게 코드의 중복을 없앤 this 생성자
    }
    _33_car(String color, int door, int seat) {
        this.color = color;
        this.door = door;
        this.seat = seat;
    }
}