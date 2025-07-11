package _06_객체지향언어;

public class _23_기본형_매개변수 {
    public static void main(String[] args) {
        _23_Data d = new _23_Data();
        d.x = 10;
        System.out.println("main(): x = " + d.x);
        change(d.x);
        System.out.println("after change(d.x)");
        System.out.println("main(): x = " + d.x);
    }
    static void change(int x){ // 이건 그냥 지역변수로 값의 변화를 주지 못함
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}
class _23_Data{
    int x;
}
