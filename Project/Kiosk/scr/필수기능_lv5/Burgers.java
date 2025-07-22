package 필수기능_lv5;

import java.util.ArrayList;
import java.util.List;

public class Burgers {
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

// 음료 메뉴 클래스
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

// 디저트 메뉴 클래스
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
