package _12_제네릭스;

public class _11_제네릭스_기본 {
    public static void main(String[] args) {
        _11_Box<String> string11Box = new _11_Box<>("abc");
        _11_Box<Integer> Integer11Box = new _11_Box<>(123);
        _11_Box<Double> double11Box = new _11_Box<>(1.2);

        String strbox = string11Box.getItem();
        System.out.println(strbox);

        string11Box.printBoxItem(strbox);

        string11Box.printItem(1111);
    }
}


class _11_Box<T>{
    // 속성
    private T item;

    // 생성자
    public _11_Box(T item){
        this.item = item;
    }
    // 기능
    public T getItem(){
        return this.item;
    }
    public void printBoxItem(T item){
        System.out.println(item);
    }

    // 제네릭스 메서드
    public <S> void printItem(S item){ // 다양한 데이터타입이 들어올 수 있다.
        System.out.println(item);
    }
}

