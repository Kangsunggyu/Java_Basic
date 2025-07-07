public class _27_매개변수의_다형성 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        Product p = new Tv(); // 참조변수의 형변환
        b.buy(p);
        b.buy(new Computer());
    }
}
class Product{
    int price;
    int bonusPoint;
    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class Tv extends Product{
    Tv(){
        super(100);
    }
    @Override
    public String toString() {
        return "TV";
    }
}
class Computer extends Product{
    Computer(){
        super(200);
    }
    @Override
    public String toString() {
        return "Computer";
    }
}
class Buyer{
    int money = 1000;
    int bonusPoint = 0;
    void buy(Product p){ // Product 타입을 매개변수로 받기에, Product의 모든 자손 객체를 받을 수 있다.
        // 조상 타입으로 매개변수를 선언하면, 자손 타입의 객체도 모두 전달할 수 있다!
        // 실제로는 Tv나 Computer 객체가 올 수 있음 → 업캐스팅 자동 적용!
        if(money < p.price){
            System.out.println("잔액부족");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + " 구매 완료!");
        System.out.println("남은 돈: " + money + ", 보너스 포인트: " + bonusPoint);
    }
}
