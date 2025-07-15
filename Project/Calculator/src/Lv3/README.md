arraylist에 총 10개의 계산결과만 들어가도록 제한하였다. 

try catch문을 추가했다.
InputMismatchException: Scanner로 입력을 받을 때 다른 타입의 값을 입력하면 예외가 발생한다.
ArithmeticException: 산술 연산에서 잘못된 계산이 수행될 때 예외가 발생한다.

enum을 추가했다. 
enum을 추가하고, 속성값만 enum에 있었을 때는 코드가 어렵지 않았다. 하지만, 람다식을 추가하려다 보니 처음보는 개념을 익혀야 했다.

private final BinaryOperator<Double> operation;
- BinaryOperator<T> 는 자바의 함수형 인터페이스로
- T 타입의 값을 두 개 받아서 같은 타입 T를 리턴하는 연산을 한다. 

static Operator fromSymbol(char symbol) {
    for (Operator op : Operator.values()) {
        if (op.symbol.charAt(0) == symbol) {
            return op;
        }
    }
    return null;
}
- 받아온 매개변수가 enum의 속성값에 있는지 확인하는 클래스 메서드이자, 반복문


double applyEnum(Double a, Double b) {
    return operation.apply(a, b);
}
- apply: BinaryOperator의 함수형 메서드, apply를 호출하여 연산 수행

enum에 람다식을 넣어 이를 계산해보았다.
enum 클래스가 너무 길어져 이 방식이 맞는지에 대한 의문이 들었다.
제레릭까지 하려고 하니, lv2와 너무 달라졌고, 내가 더 쉽게 이해하기 위해 이를 lv3, lv3_alpha 로 나누었다.