public class _35_interface {
    public static void main(String[] args) {
        // interface란 추상 메서드의 집합

        // interface의 모든 멤버는 public 이며,
        // 메서드는 모두 추상메서드이고 변수는 모두 final이다.
        // 근데 생략 가능 예외가 없으니 생략 가능

        // 인터페이스의 조상은 인터페이스만 가능하며, 다중 상속도 가능하다.
        // 인터페이스를 상속받은 클래스는 인터페이스의 모든 메서드를 구현해야 한다.
    }
}

interface Car{
    int DOOR = 1;
    void move(int x, int y);
}

class FireEngine implements Car{

    public void move(int x, int y){
        System.out.println("FireEngine is moving to (" + x + ", " + y + ")");
    }
}
