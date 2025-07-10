public class _21_열거형_멤버추가 {
    public static void main(String[] args) {
        Direction d0 = Direction.EAST;
        System.out.println("d0 = " + d0);

        Direction2 d2 = Direction2.EAST;
        System.out.println("d2 = " + d2);
        System.out.println("d2 value = " + d2.getValue());
        System.out.println("d2 symbol = " + d2.getSymbol());
    }
}

// 기본 열거형 (멤버 없이 단순 상수)
enum Direction { EAST, SOUTH, WEST, NORTH }

// 멤버 변수 + 생성자 + getter를 가진 열거형
enum Direction2 {
    EAST(2, ">"), SOUTH(5, "v"), WEST(3, "<"), NORTH(10, "^");

    private final int value;   // 추가 멤버 필드
    private final String symbol;

    // 생성자: 열거형은 반드시 private
    Direction2(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    // getter 메서드
    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    // static values()를 활용한 배열 캐시
    private static final Direction2[] ARR = Direction2.values();

}
