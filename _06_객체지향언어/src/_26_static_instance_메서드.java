public class _26_static_instance_메서드 {
    public static void main(String[] args) {
        /*
        인스턴스 메서드
        참조변수.메서드 이름으로 호출
        메서드 내에 인스턴스 변수 사용 가능
        */
        /*
        static 메서드, 클래스 메서드
        객체 생성없이 클래스이름.메서드 이름으로 호출
        메서드 내에 인스턴스 변수, 인스턴스 메서드 사용 불가
        앞서 카드에서 사용했 듯 공통 속성(static 변수)에 static 메서드를 사용하고, 혹은 iv를 사용하지 않으면 static 메서드를 사용한다.
         */
        _26_math m = new _26_math();
        m.a = 2;
        m.b = 5;
        int instanceAdd = m.add();
        System.out.println(instanceAdd);

        int staticAdd = _26_math.add(1, 2);
        System.out.println(staticAdd);
    }
}
class _26_math{
    int a, b; // 인스턴스 변수
    int add(){ // 인스턴스 메서드 iv를 사용
        return a+b;
    }
    static int add(int x, int y){ // 클래스 메서드
        return x+y; // iv를 사용하지 않고, 지역변수 사용
    }
}

