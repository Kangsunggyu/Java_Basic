public class _24_참조형_매개변수 {
    public static void main(String[] args) {
        _23_Data d = new _23_Data();
        d.x = 10;
        System.out.println("main(): x = " + d.x);
        change(d); // 객체의 데이터가 아닌, 객체의 메모리 주소를 넘긴다. 즉 참조값을 넘긴다.
        System.out.println("after change(d.x)");
        System.out.println("main(): x = " + d.x);
    }
    static void change(_23_Data d24){ // 참조값 즉 주소를 받고 그 주소의 데이터를 변경한다.
        d24.x = 1000;
        System.out.println("change() : x = " + d24.x);
    }
}