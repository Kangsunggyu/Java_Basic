public class _17_enum {
    public static void main(String[] args) {
        Card_2 c = new Card_2(Card_2.Kind.CLOVER, Card_2.Value.ONE);

        System.out.println("무늬: " + c.kind);
        System.out.println("값: " + c.value);

        // 비교 예시
        if (c.value.compareTo(Card_2.Value.ONE) == 0) {
            System.out.println("값이 ONE과 같습니다!");
        }

        // enum 상수 출력
        System.out.println("무늬 상수: " + Card_2.Kind.CLOVER);

        // 잘못된 예시: 타입 불일치!
        // Card_2 c3 = Card_2.Kind.CLOVER; // 에러!
    }
}

class Card_2 {
    enum Kind { CLOVER, HEART, DIAMOND, SPADE }
    enum Value { ONE, TWO }

    Kind kind;
    Value value;

    Card_2() {} // 디폴트 생성자

    Card_2(Kind kind, Value value) {
        this.kind = kind;
        this.value = value;
    }
}
