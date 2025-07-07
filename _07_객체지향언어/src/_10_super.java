public class _10_super {
    public static void main(String[] args) {
        _10_Child c = new _10_Child();
        c.method();
    }
}
class _10_Parent{
    int x = 10;
}
class _10_Child extends _10_Parent{
    int x = 20;
    void method(){
        System.out.println("x= " + x );
        System.out.println("this.x= " + this.x ); // 자신으 멤버를 가르킴
        System.out.println("super.x= " + super.x ); // 조상의 멤버를 가르킴 
    }
}
