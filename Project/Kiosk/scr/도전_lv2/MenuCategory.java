package 도전_lv2;

import java.util.ArrayList;
import java.util.List;
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