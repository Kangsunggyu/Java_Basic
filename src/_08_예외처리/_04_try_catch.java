package _08_예외처리;

public class _04_try_catch {
    public static void main(String[] args) {
        System.out.println("예외처리하기");
        try{
            System.out.println(1);
            System.out.println(0/0); // 문제 발견
            System.out.println(2); // 무시된다.
        } catch (ArithmeticException ae){
            System.out.println("ArithmeticException 문제 발견");
        }catch (Exception e){
            System.out.println("이건 모든 예외를 잡아낸다.");
        }
        System.out.println(3);
    }
}
