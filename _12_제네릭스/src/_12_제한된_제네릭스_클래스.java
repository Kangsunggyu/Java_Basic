import java.util.ArrayList;

public class _12_제한된_제네릭스_클래스 {
    public static void main(String[] args) {
        // FruitBox는 Fruit이면서 Eatable한 타입만 담을 수 있음
        FruitBox<Fruit> fruitBox = new FruitBox<>();

        //예시
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();
        // FruitBox<Toy> toyBox = new FruitBox<>(); // 에러! Toy는 Fruit도 아니고 Eatable도 아님

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); // Fruit의 자손이므로 OK
        fruitBox.add(new Grape()); // Fruit의 자손이므로 OK


        appleBox.add(new Apple());
        // appleBox.add(new Grape()); // 에러! Grape는 Apple의 자손이 아님

        grapeBox.add(new Grape());

        // 결과 출력
        System.out.println("fruitBox: " + fruitBox);
        System.out.println("appleBox: " + appleBox);
        System.out.println("grapeBox: " + grapeBox);
    }
}

interface Eatable{}

class Fruit implements Eatable{
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Toy{ // 먹을 수 없음
    @Override
    public String toString() {
        return "Toy";
    }
}

class Box<T>{  // 여기서  T는 아무거나 담을 수 있다는 의미
    ArrayList<T> list = new ArrayList<>();

    void add(T item) { list.add(item); }  // 아이템 추가
    T get(int i) { return list.get(i); }  // 아이템 가져오기
    int size() { return list.size(); }    // 아이템 개수

    @Override
    public String toString() {
        return list.toString();
    }
}

// FruitBox는 Box를 상속하며, Fruit이면서 Eatable한 타입만 담을 수 있음
class FruitBox<T extends Fruit & Eatable> extends Box<T>{}
