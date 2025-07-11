package _08_예외처리;

public class _14_finally {
    public static void main(String[] args) {
        // 예외 발생여부 상관없이 수행되어야 하는 코드
        try{
            System.out.println(1);
            System.out.println(0/0);
            System.out.println(2);
        }catch (Exception e){
            System.out.println("예외");
        } finally {
            System.out.println("예외 발생하든 안하든 수행되는 코드");
        }
    }
}
