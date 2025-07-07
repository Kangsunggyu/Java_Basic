public class _06_객체의_생성과_사용 {
    public static void main(String[] args) {
        TV_06 tv = new TV_06();
        tv.channel = 7;
        tv.channelDown();
        System.out.println("현재 채널은 " + tv.channel + " 입니다.");
    }
}

class TV_06{
    //TV의 속성(변수)
    String color;
    boolean power;
    int channel;

    // TV의 기능(메서드)
    void power() {
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}