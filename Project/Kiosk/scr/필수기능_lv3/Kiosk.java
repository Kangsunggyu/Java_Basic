package 필수기능_lv3;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Kiosk{
    Scanner scanner = new Scanner(System.in);
    List<MenuItem> menuList = new ArrayList<>();

    void start(){
        int choice;
        addMenu();
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            printAllMenu();
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
            } else if (choice >= 1 && choice <= menuList.size()) {
                System.out.println(choice + "번 " + menuList.get(choice - 1).name + "를 선택하셨습니다!");
            } else {
                System.out.println("없는 매뉴입니다.");
            }
        }
    }
    void printAllMenu(){
        for (int i = 0; i < menuList.size(); i++) {
            MenuItem item = menuList.get(i);
            System.out.println((i + 1) + ". " + item.name + " | W " + (item.price) + " | " + item.explain);
        }
    }
    void addMenu(){
        menuList.add(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuList.add(new MenuItem("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuList.add(new MenuItem("Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuList.add(new MenuItem("Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }
}