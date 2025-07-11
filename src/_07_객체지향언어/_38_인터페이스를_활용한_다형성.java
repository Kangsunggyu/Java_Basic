package _07_객체지향언어;

public class _38_인터페이스를_활용한_다형성 {
    public static void main(String[] args) {

        // 다형성을 보여주는 핵심 부분:
        // Fighter 클래스의 객체를 생성하지만, 이 객체를 Fightable 인터페이스 타입의 참조 변수 'f'에 할당합니다.
        // 이는 Fighter가 Fightable 인터페이스를 구현했기 때문에 가능한 일입니다.
        // 'f'는 이제 Fighter 객체를 참조하지만, Fightable 인터페이스에 정의된 메서드만 호출할 수 있습니다.
        Fightable f = new Fighter();
        System.out.println("Created a Fighter object as a Fightable reference."); // 객체 생성 확인 메시지

        // 'f' (Fightable 타입 참조)를 통해 move 메서드를 호출합니다.
        // 실제로는 Fighter 클래스에서 오버라이드(재정의)된 move 메서드가 실행됩니다.
        f.move(100, 200);

        // f.stop() 불가

        System.out.println("\nDemonstrating attack method with an interface parameter:"); // 다음 시연에 대한 메시지

        // attack 메서드를 호출하면서, Fightable 인터페이스를 구현한 새로운 Fighter 객체를 매개변수로 전달합니다.
        // attack 메서드는 Fightable 타입의 매개변수를 받기 때문에, Fightable을 구현하는 모든 객체가 인자로 올 수 있습니다.
        f.attack(new Fighter());

        // 또 다른 Fighter 객체를 생성하고 Fightable 타입으로 참조합니다.
        Fightable anotherFighter = new Fighter();
        System.out.println("\nDemonstrating attack method with another Fightable object:"); // 다음 시연에 대한 메시지

        // 위에서 생성한 'anotherFighter' 객체를 attack 메서드의 인자로 전달합니다.
        f.attack(anotherFighter);

        // Fighter 타입으로 직접 객체를 생성합니다.
        Fighter f2 = new Fighter();

        // f2 객체의 getFightable() 메서드를 호출하여 Fightable 타입의 객체를 반환받습니다.
        // getFightable() 메서드는 내부적으로 Fighter 객체를 생성하여 Fightable 타입으로 반환합니다.
        Fightable f3 = f2.getFightable();
    }
}

// Fightable 인터페이스 정의:
// 이 인터페이스는 '싸울 수 있는' 객체가 반드시 가져야 할 기능(메서드)을 정의합니다.
// 인터페이스를 구현하는 클래스는 이 인터페이스에 정의된 모든 추상 메서드를 구체적으로 구현해야 합니다.
interface Fightable {
    void move(int x, int y); // 이동 기능을 정의하는 추상 메서드

    // 공격 기능을 정의하는 추상 메서드.
    // 매개변수로 'Fightable' 타입의 객체를 받습니다.
    // 이는 이 메서드를 호출할 때, Fightable 인터페이스를 구현한 어떠한 클래스의 객체라도 인자로 전달될 수 있음을 의미합니다.
    // 예를 들어, Fighter, Monster, Hero 등 Fightable을 구현한 객체라면 모두 가능합니다.
    void attack(Fightable f); // 해당 Fightable을 구현한 클래스만 해당 매개변수로 들어올 수 있다는 의미
}

// Fighter 클래스 정의:
// Unit 클래스 (제공된 이미지에는 있었으나 코드에는 생략됨)를 상속하고, Fightable 인터페이스를 구현합니다.
class Fighter implements Fightable {
    @Override // 인터페이스의 메서드를 재정의(구현)함을 나타내는 어노테이션
    public void move(int x, int y) {
        System.out.println("Fighter moves to: (" + x + ", " + y + ")"); // 이동 동작 구현
        // 실제 게임에서는 캐릭터의 위치를 변경하는 로직이 여기에 들어갑니다.
    }

    @Override // 인터페이스의 메서드를 재정의(구현)함을 나타내는 어노테이션
    public void attack(Fightable f) { // Fightable 인터페이스를 매개변수로 받습니다.
        System.out.println("Fighter attacks another Fightable object."); // 공격 동작 구현
        // 실제 게임에서는 'f' 객체에 데미지를 주거나 상태를 변경하는 로직이 들어갈 수 있습니다.
        // 'f'는 Fightable 타입이므로, 'f.move()'나 'f.attack()'과 같이 Fightable에 정의된 메서드만 호출할 수 있습니다.
    }

    void stop(){
        System.out.println("멈춘다.");
    }
    // Fightable 인터페이스 타입의 객체를 반환하는 메서드.
    // 이는 '팩토리 메서드'의 간단한 형태로 볼 수 있습니다.
    // 이 메서드를 호출하는 쪽에서는 어떤 Fightable 객체가 생성되는지 구체적으로 알 필요 없이,
    // 단지 Fightable 기능을 가진 객체를 얻는다는 것만 알면 됩니다.
    Fightable getFightable(){
        Fighter f = new Fighter(); // 새로운 Fighter 객체를 생성
        return f; // 생성된 Fighter 객체를 Fightable 타입으로 반환 (Fighter는 Fightable을 구현했으므로 가능)
    }
}
