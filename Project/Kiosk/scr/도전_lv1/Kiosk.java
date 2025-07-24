package 도전_lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Kiosk {
    Scanner scanner = new Scanner(System.in);
    private final List<MenuCategory> categories = new ArrayList<>();

    public Kiosk() {
        categories.add(new Burgers());
        categories.add(new Drinks());
        categories.add(new Desserts());
    }
    Cart cart = new Cart();

    public void start() {
        while (true) {
            System.out.println("\n[ MAIN MENU ]");
            for (int i = 0; i < categories.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, categories.get(i).getCategoryName()); // 추상클래스를 활용한 카테고리별 이름 출력
            }
            System.out.println("0. 주문하기");
            System.out.print(">> ");
            int choice = getInt();

            if (choice == 0) { // 추상 클래스를 추가해 이에 맞추어 switch문을 변경
                orderMenu();
                return;
            } else if (choice >= 1 && choice <= categories.size()) { // 사이즈에 없는 값을 입력했다면 else로
                MenuCategory selectedCategory = categories.get(choice - 1);
                selectMenu(selectedCategory);
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private void selectMenu(MenuCategory category) {
        while (true) {
            System.out.println("\n[ " + category.getCategoryName() + " MENU ]");
            List<MenuItem> list = category.getMenuItems();
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i));
            }
            System.out.println("0. 뒤로가기");
            System.out.print(">> ");
            int choice = getInt();

            if (choice == 0) return;
            else if (choice >= 1 && choice <= list.size()) {
                MenuItem item = list.get(choice - 1);
                System.out.println("\n선택한 메뉴: " + item);
                System.out.println("장바구니에 추가하시겠습니까?");
                System.out.print("1. 확인        2. 취소\n>> ");
                int addChoice = getInt();
                if (addChoice == 1) {
                    cart.addCart(item);
                    System.out.println(item.getName() + " 장바구니에 추가되었습니다.");
                } else {
                    System.out.println("취소되었습니다.");
                }
                return;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private void orderMenu() { // 도전 lv1에 추가한 메서드 장바구니에 무엇이 들었고, 주문하는 메서드
        if (cart.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
            return;
        }
        cart.printAllCart();
        System.out.println("\n[ Total ]");
        System.out.println("W " + cart.sumOfPrice());
        System.out.println("\n주문하시겠습니까?");
        System.out.print("1. 주문        2. 취소\n>> ");
        int choice = getInt();
        if (choice == 1) {
            System.out.println("주문이 완료되었습니다.");
            cart.clearCart();
        } else {
            System.out.println("주문이 취소되었습니다.");
        }
    }

    private int getInt() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}