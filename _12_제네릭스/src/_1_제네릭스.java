import java.util.ArrayList;

public class _1_제네릭스 {
    public static void main(String[] args) {
        // 제네릭스란?
        // 컴파일 시 타입을 체크해주는 기능, 타입 체크를 강화
        ArrayList<Tv> tvList = new ArrayList<Tv>();

        tvList.add(new Tv());
        //이 외의 다른 객체는 불가.

        //꺼낼 때
        Tv t = tvList.get(0);
    }
}
class Tv{
    int channel;
}
