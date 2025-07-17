package 도전;

import java.util.*;

public class lv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
}

class MenuItem {
    String name;
    int price;
    String explain;

    MenuItem() {
    }

    MenuItem(String name, int price, String explain) {
        this.name = name;
        this.price = price;
        this.explain = explain;
    }
}

class MenuList {
    List<MenuItem> arrayList = new ArrayList<>();

    void setList(MenuItem menuItem, int num) {

    }

    void getList() {

    }

    void addList(MenuItem menuItem) {
        arrayList.add(menuItem);
    }

    void deleteList(int num){
        arrayList.remove(num);
    }

    void printAllList() {
        for (MenuItem item : arrayList) {
            System.out.println(item.name + " | W " + item.price + " | " + item.explain);
        }
    }
}
class Manager{
    MenuItem menuItem = new MenuItem();
    Scanner scanner = new Scanner(System.in);
    MenuList menuList;

    void managerList(){
        System.out.println("메뉴 추가하기");
        addMenu();
        System.out.println("메뉴 읽어오기");
        readMenu();
        System.out.println("메뉴 수정하기");
        updateMenu();
        System.out.println("메뉴 삭제하기");
        deleteMenu();
    }
    void addMenu(){
        System.out.println("추가할 햄버거의 이름, 가격, 설명을 적으시오");
        System.out.println("이름: ");
        String name = scanner.nextLine().trim();
        System.out.println("가격: ");
        int price = scanner.nextInt();
        System.out.println("설명: ");
        String explain = scanner.nextLine().trim();
        MenuItem newItem = new MenuItem(name, price, explain);
        menuList.addList(newItem);
    }
    void readMenu(){
        menuList.printAllList();
    }
    void updateMenu(){
        System.out.println("수정할 햄버거의 이름, 가격, 설명, 번호를 적으시오"); // 번호를 기준으로 변경
        System.out.println("이름: ");
        String name = scanner.nextLine().trim();
        System.out.println("가격: ");
        int price = scanner.nextInt();
        System.out.println("설명: ");
        String explain = scanner.nextLine().trim();
        System.out.println("번호: ");
        int num = scanner.nextInt();
        MenuItem newItem = new MenuItem(name, price, explain);
        menuList.setList(newItem, num);
    }
    void deleteMenu(){
        System.out.println("삭제할 햄버거의 번호를 적으시오");
        int num = scanner.nextInt();
        menuList.deleteList(num);
    }



}
class Consumer {
    MenuList menuList = new MenuList();
    Scanner scanner = new Scanner(System.in);
    int choice;

    void menuList() {
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            menuList.printAllList();
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
        scanner.close();
    }
}
