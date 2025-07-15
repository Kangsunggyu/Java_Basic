package Lv3_alpha;

import java.util.ArrayList;
import java.util.function.BinaryOperator;

class History {
    private ArrayList<Double> arrayList = new ArrayList<>();

    private static final int MAX_HISTORY_SIZE = 10;

    Double getHistory(int num){
        if (num >= 0 && num < arrayList.size()) {
            return arrayList.get(num);
        } else {
            System.out.println("오류: 유효하지 않은 이력 인덱스입니다.");
            return null;
        }
    }
    void setHistory(int num, double value){
        if (num >= 0 && num < arrayList.size()) {
            arrayList.set(num, value);
        } else {
            System.out.println("오류: 유효하지 않은 이력 인덱스입니다.");
        }
    }
    private void removeHistory(){
        arrayList.remove(0);
    }
    void addHistory(Double value){
        if(arrayList.size() >= MAX_HISTORY_SIZE){
            removeHistory();
        }
        arrayList.add(value);
    }
    void printHistory(){
        if (arrayList.isEmpty()) {
            System.out.println("저장된 계산 이력이 없습니다.");
            return;
        }
        for (int i = 0; i < this.arrayList.size(); i++) {
            System.out.println((i + 1) + ". " + this.getHistory(i));
        }
    }
}

class Calculator <T extends Number> {
    private History history = new History();
    void doOperation(T a, T b, Operator operator) {
        double result = 0;
        result = operator.applyEnum(a.doubleValue(), b.doubleValue());
        System.out.println(a + " " + operator.getSymbol() + " " + b + " = " + result);
        history.addHistory(result);
    }
    History getHistory() {
        return history;
    }
}

enum Operator {
    ADD("+", (a, b) -> a + b), // Double 타입의 덧셈
    SUBTRACT("-", (a, b) -> a - b), // Double 타입의 뺄셈
    MULTIPLY("*", (a, b) -> a * b), // Double 타입의 곱셈
    DIVIDE("/", (a, b) -> {
        if (b == 0) {
            throw new ArithmeticException("0으로는 나눌 수 없습니다."); // 예외 떠넘기기
        }
        return a / b;
    });

    private final String symbol; // 연산자 기호
    private final BinaryOperator<Double> operation; // Double 타입 2개를 받아서 double 을 리턴하는 함수, 인터넷에서 찾음

    Operator(String symbol, BinaryOperator<Double> operation){ // 생성자
        this.symbol = symbol;
        this.operation = operation;
    }

    // 연산자 기호로 Operator를 찾는 메서드
    static Operator fromSymbol(char symbol) {
        for (Operator op : Operator.values()) {
            if (op.symbol.charAt(0) == symbol) {
                return op;
            }
        }
        return null;
    }
    // 실제 연산
    double applyEnum(Double a, Double b) {
        return operation.apply(a, b);
    } // apply라고 하는 자바에서 제공되는 메서드
    // 연산자 기호를 반환하는 메서드 추가
    String getSymbol() {
        return symbol;
    }
}