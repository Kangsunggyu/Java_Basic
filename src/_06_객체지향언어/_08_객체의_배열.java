package _06_객체지향언어;

public class _08_객체의_배열 {
    public static void main(String[] args) {
        TV_06[] tv = new TV_06[3];
        tv[0] = new TV_06();
        tv[1] = new TV_06();
        tv[2] = new TV_06();
        tv[0].channel = 23;
        System.out.println("현재 채널은 " + tv[0].channel + " 입니다.");

    }
}
