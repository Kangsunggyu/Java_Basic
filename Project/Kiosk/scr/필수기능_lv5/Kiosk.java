package 필수기능_lv5;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Kiosk {
    Scanner scanner = new Scanner(System.in);
    private final Burgers burgers = new Burgers();
    private final Drinks drinks = new Drinks();
    private final Desserts desserts = new Desserts();

    public void start() {
        while (true) {
            System.out.println("\n[ MAIN MENU ]");
            System.out.println("1. Burgers");
            System.out.println("2. Drinks");
            System.out.println("3. Desserts");
            System.out.println("0. 종료");
            System.out.print(">> ");
            int choice = getInt();

            switch (choice) {
                case 1:
                    selectMenu("BURGERS", burgers.getMenuItems());
                    break;
                case 2:
                    selectMenu("DRINKS", drinks.getMenuItems());
                    break;
                case 3:
                    selectMenu("DESSERTS", desserts.getMenuItems());
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private void selectMenu(String categoryName, List<MenuItem> list) {
        while (true) {
            System.out.println("[ " + categoryName + " MENU ]");
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i));
            }
            System.out.println("0. 뒤로가기");
            System.out.print(">> ");
            int choice = getInt();

            if (choice == 0) return;
            else if (choice >= 1 && choice <= list.size()) {
                System.out.println("\n선택한 메뉴: " + list.get(choice - 1));
                return;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private int getInt() {
        while (true) {
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                return choice;
            } catch (InputMismatchException e) {
                System.out.print("숫자를 다시 입력하시오\n>> ");
                scanner.nextLine();
            }
        }
    }
}
