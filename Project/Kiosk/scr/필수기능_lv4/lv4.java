package 필수기능_lv4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class lv4 {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        kiosk.start();
    }
}

class MenuItem {
    String name;
    double price;
    String explain;

    MenuItem(String name, double price, String explain) {
        this.name = name;
        this.price = price;
        this.explain = explain;
    }
}

class Kiosk {
    Scanner scanner = new Scanner(System.in);
    Burgers burgers = new Burgers();
    Drinks drinks = new Drinks();
    Desserts desserts = new Desserts();

    void start() {
        while (true) {
            System.out.println("\n[ MAIN MENU ]");
            System.out.println("1. Burgers");
            System.out.println("2. Drinks");
            System.out.println("3. Desserts");
            System.out.println("0. 종료      | 종료");
            System.out.print(">> ");
            int mainChoice = getInput();

            switch (mainChoice) {
                case 1:
                    selectMenu("BURGERS", burgers.menuItems);
                    break;
                case 2:
                    selectMenu("DRINKS", drinks.menuItems);
                    break;
                case 3:
                    selectMenu("DESSERTS", desserts.menuItems);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    void selectMenu(String categoryName, List<MenuItem> list) {
        while (true) {
            System.out.println("\n[ " + categoryName + " MENU ]");
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i)); // 각 메뉴 출력
            }
            System.out.println("0. 뒤로가기");
            System.out.print(">> ");
            int choice = getInput();

            if (choice == 0) return;
            else if (choice >= 1 && choice <= list.size()) {
                System.out.println("\n선택한 메뉴: " + list.get(choice - 1));
                return;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    int getInput() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}

class Burgers {
    List<MenuItem> menuItems = new ArrayList<>();

    Burgers() {
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }
}

class Drinks {
    List<MenuItem> menuItems = new ArrayList<>();

    Drinks() {
        menuItems.add(new MenuItem("Lemonade", 3.5, "신선한 레몬으로 만든 상큼한 음료"));
        menuItems.add(new MenuItem("Coke", 2.5, "톡 쏘는 시원한 콜라"));
    }
}

class Desserts {
    List<MenuItem> menuItems = new ArrayList<>();

    Desserts() {
        menuItems.add(new MenuItem("Ice Cream", 4.0, "달콤한 바닐라 아이스크림"));
        menuItems.add(new MenuItem("Cookie", 2.0, "촉촉한 초코칩 쿠키"));
    }
}
