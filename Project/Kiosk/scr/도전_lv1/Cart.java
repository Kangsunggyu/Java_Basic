package 도전_lv1;

import java.util.ArrayList;
import java.util.List;

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