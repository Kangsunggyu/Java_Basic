package 도전_lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

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
            System.out.println("할인 정보를 입력해주세요"); // 도전 lv2에 추가
            for (DiscountRate rate : DiscountRate.values()) {
                System.out.printf("%s. %s\n", rate.getCode(), rate.getLabel());
            }
            System.out.print(">> ");
            String discountCode = scanner.nextLine(); // 문자열이라 int가 아닌 Line
            DiscountRate rate = DiscountRate.fromCode(discountCode); // 1, 2, 3, 4 중 무엇을 입력했는지 받고
            double discountPrice = rate.applyDiscount(cart.sumOfPrice());
            System.out.printf("주문이 완료되었습니다. 금액은 W%.1f\n", discountPrice);
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

enum DiscountRate { // 도전 lv2에 추가한 클래스
    NATIONAL_MERIT("1", "국가유공자 (10%)", price -> price * 0.90),
    SOLDIER("2", "군인 (5%)", price -> price * 0.95),
    STUDENT("3", "학생 (3%)", price -> price * 0.97),
    NORMAL("4", "일반 (0%)", price -> price);

    private final String code; // 1, 2, 3, 4를 의미
    private final String label; // 국가유공자 10% 등을 의미
    private final Function<Double, Double> discountFunction; // 입력값을 받아서 결과값을 반환하는 함수, Function<T, R>,  T → 입력 타입 (Input), R → 반환 타입 (Return)

    DiscountRate(String code, String label, Function<Double, Double> discountFunction) {
        this.code = code;
        this.label = label;
        this.discountFunction = discountFunction;
    }

    double applyDiscount(double price) {
        return discountFunction.apply(price);
    }

    String getCode() {
        return code;
    }

    String getLabel() {
        return label;
    }

    static DiscountRate fromCode(String code) { // 해당 1, 2, 3, 4가 있는지 체크하는 메서드
        for (DiscountRate rate : values()) {
            if (rate.code.equals(code)) {
                return rate;
            }
        }
        return NORMAL; // 없으면 할인율 0
    }
}

public class lv5 {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        kiosk.start();
    }
}
