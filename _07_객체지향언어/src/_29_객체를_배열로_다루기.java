public class _29_객체를_배열로_다루기 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        Product2 p = new Tv2(); // 참조변수의 형변환
        b.buy(p);
        b.buy(new Computer2());

        b.summary();
    }
}
class Product2{
    int price;
    int bonusPoint;
    Product2(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class Tv2 extends Product2{
    Tv2(){
        super(100);
    }
    @Override
    public String toString() {
        return "TV";
    }
}
class Computer2 extends Product2{
    Computer2(){
        super(200);
    }
    @Override
    public String toString() {
        return "Computer";
    }
}
class Buyer2{
    int money = 1000;
    int bonusPoint = 0;
    Product2[] cart = new Product2[10];
    int i=0;
    void buy(Product2 p){ // Product 타입을 매개변수로 받기에, Product의 모든 자손 객체를 받을 수 있다.
        // 조상 타입으로 매개변수를 선언하면, 자손 타입의 객체도 모두 전달할 수 있다!
        // 실제로는 Tv나 Computer 객체가 올 수 있음 → 업캐스팅 자동 적용!
        if(money < p.price){
            System.out.println("잔액부족");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;
        System.out.println(p + " 구매 완료!");
        System.out.println("남은 돈: " + money + ", 보너스 포인트: " + bonusPoint);
    }
    void summary(){
        int sum = 0;
        String itemList = "";
        for (int i = 0; i < cart.length; i++) {
            if(cart[i] == null) break;
            sum += cart[i].price;
            itemList += cart[i] + ", ";
        }
        System.out.println("총 구매 금액: " + sum);
        System.out.println("구매 상품 목록: " + itemList);
    }
}
