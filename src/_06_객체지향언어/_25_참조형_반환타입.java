package _06_객체지향언어;

public class _25_참조형_반환타입 {
    public static void main(String[] args) {
        _23_Data d = new _23_Data();
        d.x = 10;
        System.out.println("main(): x = " + d.x);

        _23_Data d2 = copy(d); // 객체의 주소값을 전달받는다. 즉 데이터가 아니라 참조값 주소값을 받는 것
        System.out.println("after change(d.x)");
        System.out.println("main(): x = " + d.x);
    }
    static _23_Data copy(_23_Data d23){
        _23_Data tmp = new _23_Data();
        tmp.x = d23.x;
        return tmp;
    }
}
