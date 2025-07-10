import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        double i, j;
        char operator;
        String exitInput;

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("첫번째 숫자를 입력하시오: ");
                i = scanner.nextDouble();
                System.out.print("두번째 숫자를 입력하시오: ");
                j = scanner.nextDouble();
                System.out.print("연산자를 입력하시오 (+, -, *, /): ");
                operator = scanner.next().charAt(0);
                scanner.nextLine();

                switch (operator) {
                    case '+': {
                        calculator.add(i, j);
                        break;
                    }
                    case '-': {
                        calculator.subtract(i, j);
                        break;
                    }
                    case '*': {
                        calculator.multiply(i, j);
                        break;
                    }
                    case '/': {
                        calculator.divide(i, j);
                        break;
                    }
                    default: {
                        System.out.println("연산자를 올바르게 작성하시오.");
                    }
                }
                System.out.println("\n--- 계산 이력 ---");
                calculator.history.printHistory();
                System.out.println("----------------\n");

                System.out.print("프로그램을 종료하려면 \"exit\"를 입력하거나, 계속하려면 아무 키나 입력하세요: ");
                exitInput = scanner.nextLine().trim();
                if (exitInput.equalsIgnoreCase("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("알 수 없는 오류가 발생했습니다: " + e.getMessage());
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}


class History {
    private ArrayList<Double> arrayList = new ArrayList<>();

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

    void removeHistory(){
        arrayList.remove(0);
    }

    void addHistory(Double value){
        if(arrayList.size() >= 10){
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


class Calculator {
    double result;

    History history = new History();

    void add(double a, double b) {
        result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        history.addHistory(result);
    }

    void subtract(double a, double b) {
        result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        history.addHistory(result);
    }

    void multiply(double a, double b) {
        result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        history.addHistory(result);
    }

    void divide(double a, double b) {
        if (b != 0) {
            result = a / b;
            System.out.println(a + " / " + b + " = " + result);
            history.addHistory(result);
        } else {
            System.out.println("0으로는 나눌 수 없습니다.");
        }
    }
}