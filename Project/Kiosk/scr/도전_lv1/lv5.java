package 도전_lv1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class MenuItem {
    private String name;
    private int price;
    private String explain;

    public MenuItem(String name, int price, String explain) { // 하나하나의 메뉴를 뜻함
        this.name = name;
        this.price = price;
        this.explain = explain;
    }
    String getName() {return name;}
    int getPrice() {return price;}
    @Override
    public String toString() {return name + "   | W " + price + " | " + explain;}
}

abstract class MenuCategory { // 추상클래스 이렇게 쓰는건가?
    protected List<MenuItem> menuItems = new ArrayList<>();
    abstract String getCategoryName();
    public List<MenuItem> getMenuItems() { // 각 카테고리의 리스트를 전달하는 메서드
        return menuItems;
    }
}

class Burgers extends MenuCategory {
    Burgers() {
        menuItems.add(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }
    @Override
    String getCategoryName() {return "BURGERS";}
}
class Drinks extends MenuCategory {
    Drinks() {
        menuItems.add(new MenuItem("Lemonade", 3500, "신선한 레몬으로 만든 상큼한 음료"));
        menuItems.add(new MenuItem("Coke", 2500, "톡 쏘는 시원한 콜라"));
    }
    @Override
    String getCategoryName() {return "DRINKS";}
}
class Desserts extends MenuCategory {
    Desserts() {
        menuItems.add(new MenuItem("Ice Cream", 4000, "달콤한 바닐라 아이스크림"));
        menuItems.add(new MenuItem("Cookie", 2000, "촉촉한 초코칩 쿠키"));
    }
    @Override
    String getCategoryName() {return "DESSERTS";}
}

class Cart { // 도전 lv1에 추가한 카트 클래스
    private final List<MenuItem> cartList = new ArrayList<>();

    void addCart(MenuItem item) {
        cartList.add(item);
    }

    void printAllCart() {
        System.out.println("\n[ CART ]");
        for (MenuItem item : cartList) {
            System.out.println(item);
        }
    }

    int sumOfPrice() {
        int sum = 0;
        for (MenuItem item : cartList) {
            sum += item.getPrice();
        }
        return sum;
    }

    void clearCart() {
        cartList.clear();
    }

    boolean isEmpty() {
        return cartList.isEmpty();
    }
}

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
                System.out.printf("%d. %s\n", i + 1, categories.get(i).getCategoryName());
            }
            System.out.println("0. 주문하기");
            System.out.print(">> ");
            int choice = getInt();

            if (choice == 0) { // 추상 클래스를 추가해 이에 맞추어 switch문을 변경
                orderMenu();
                return;
            } else if (choice >= 1 && choice <= categories.size()) {
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
public class lv5 {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        kiosk.start();
    }
}
