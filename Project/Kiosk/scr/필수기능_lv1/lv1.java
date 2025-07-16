package 필수기능_lv1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");

            System.out.print("메뉴 번호를 선택하세요 (종료는 0): ");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하시오");
                scanner.nextLine();
                continue;
            }

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice >= 1 && choice <= 4) {
                System.out.println(choice + "번 메뉴를 선택하셨습니다!");
            } else {
                System.out.println("없는 매뉴입니다.");
            }
        }
        System.out.println();
    }
}
