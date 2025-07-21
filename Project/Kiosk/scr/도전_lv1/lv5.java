package 도전_lv1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class lv5 {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        kiosk.start();
    }
}

class Cart{ // 도전 lv1에 추가한 클래스
    List<MenuItem> cartList = new ArrayList<>();
    void addCart(MenuItem item) {
        cartList.add(item);
    }
    void deleteCart(int num){
        cartList.remove(num);
    }
    void printAllCart() {
        if (cartList.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
            return;
        }
        for (MenuItem item : cartList) {
            System.out.println(item.getName() + " | W "+item.getPrice());
        }
    }
    int sumOfPrice(){
        int sum=0;
        for (MenuItem item : cartList) {
            sum += item.getPrice();
        }
        return sum;
    }
}

class MenuItem {
    private String name;
    private int price;
    private String explain;

    public MenuItem(String name, int price, String explain) {
        this.name = name;
        this.price = price;
        this.explain = explain;
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}
    public String getExplain() {return explain;}
    public void setExplain(String explain) {this.explain = explain;}

    @Override
    public String toString() {
        return name + " | W " + price + " | " + explain;
    }
}

class Burgers {
    private final List<MenuItem> menuItems = new ArrayList<>();

    Burgers() {
        menuItems.add(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
class Drinks {
    private final List<MenuItem> menuItems = new ArrayList<>();

    Drinks() {
        menuItems.add(new MenuItem("Lemonade", 3500, "신선한 레몬으로 만든 상큼한 음료"));
        menuItems.add(new MenuItem("Coke", 2500, "톡 쏘는 시원한 콜라"));
    }

    List<MenuItem> getMenuItems() {
        return menuItems;
    }
}

class Desserts {
    private final List<MenuItem> menuItems = new ArrayList<>();

    Desserts() {
        menuItems.add(new MenuItem("Ice Cream", 4000, "달콤한 바닐라 아이스크림"));
        menuItems.add(new MenuItem("Cookie", 2000, "촉촉한 초코칩 쿠키"));
    }

    List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
class Kiosk {
    Scanner scanner = new Scanner(System.in);
    private final Burgers burgers = new Burgers();
    private final Drinks drinks = new Drinks();
    private final Desserts desserts = new Desserts();
    Cart cart = new Cart();

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
                    // 도전과제 lv1에 추가한 코드 0을 입력하면 주문한 목록을 보여주고 주문할 것인지 체크
                    orderMenu();
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private void selectMenu(String categoryName, List<MenuItem> list) {
        int choiceMenu, choiceAddCart;
        while (true) {
            System.out.println("\n[ " + categoryName + " MENU ]");
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i));
            }
            System.out.println("0. 뒤로가기");
            System.out.print(">> ");
            choiceMenu = getInt();

            if (choiceMenu == 0) return;
            else if (choiceMenu >= 1 && choiceMenu <= list.size()) {
                System.out.println("\n선택한 메뉴: " + list.get(choiceMenu - 1));

                // 도전과제 lv1 에서 추가한 코드, 사용자가 추가한 메뉴를 받아 Cart 클래스의 리스트에 저장한다.
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.print("1. 확인        2. 취소\n>> ");
                choiceAddCart = scanner.nextInt();
                scanner.nextLine();
                if(choiceAddCart == 1){
                    cart.addCart(list.get(choiceMenu-1));
                    System.out.println(list.get(choiceMenu-1).getName() + "이 장바구니에 추가되었습니다.");
                } else {
                    System.out.println("장바구니에 추가하지 않았습니다.");
                }
                return;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private void orderMenu(){ //도전 lv1에 추가한 메서드
        System.out.println("\n[ ORDER MENU ]");
        System.out.println("1. Orders");
        System.out.println("2. Cancel");
        System.out.print(">> ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if(choice == 1){
            System.out.println("아래와 같이 주문 하시겠습니까?");
            System.out.println("\n[ Orders ]");
            cart.printAllCart();
            System.out.println("\n[ Total ]\nW " + cart.sumOfPrice());
            System.out.println("주문이 완료되었습니다. \n금액은 W " + cart.sumOfPrice());
        }else{
            System.out.println("주문을 취소합니다.");

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
