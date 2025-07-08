public class _07_getMessage {
    public static void main(String[] args) {
        System.out.println("예외처리하기");
        try{
            System.out.println(1);
            System.out.println(0/0);
            System.out.println(2);
        } catch (ArithmeticException ae){
            ae.printStackTrace();
            System.out.println(ae.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
