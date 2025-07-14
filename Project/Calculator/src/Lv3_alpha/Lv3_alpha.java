package Lv3_alpha;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lv3_alpha {
    public static void main(String[] args) {
        Calculator<Double> calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        Operator operator;
        double i, j;
        char printOperator;

        while (true) {
            try {
                System.out.print("첫번째 숫자를 입력하시오: ");
                i = scanner.nextDouble();
                System.out.print("두번째 숫자를 입력하시오: ");
                j = scanner.nextDouble();
                System.out.print("연산자를 입력하시오 (+, -, *, /): ");
                printOperator = scanner.next().charAt(0);
                scanner.nextLine();
                operator = Operator.fromSymbol(printOperator); // + - / % 를 입력했는지 확인, 아니라면 null을 리턴, 클래스 메서드

                if (operator == null) {
                    System.out.println("연산자를 올바르게 작성하시오.");
                    continue;
                } else {
                    calculator.doOperation(i, j, operator); // 값과 객체를 보낸다.
                }

                System.out.println("\n--- 계산 이력 ---");
                calculator.getHistory().printHistory();
                System.out.println("----------------\n");
                System.out.print("프로그램을 종료하려면 \"exit\"를 입력하거나, 계속하려면 아무 키나 입력하시오: ");
                String exitInput = scanner.nextLine().trim();

                if (exitInput.equalsIgnoreCase("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하시오");
                scanner.nextLine();
            } catch (ArithmeticException e){
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("오류가 발생했습니다: " + e.getMessage());
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}