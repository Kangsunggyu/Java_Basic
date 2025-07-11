package _07_객체지향언어;

public class _23_다형성 {
    public static void main(String[] args) {
        // 조상 타입 참조 변수로 자손타입 객체를 다루는 것
        _23_TV t = new _23_smartTv();
    }
}
class _23_TV {
    Boolean power;
    int channel;
    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}
class _23_smartTv extends _23_TV{
    String text;
    int number;
}