import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        int i, j;
        char operator;
        String exit;

        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("첫번째 숫자를 입력하시오: ");
            i = scanner.nextInt();
            System.out.print("두번째 숫자를 입력하시오: ");
            j = scanner.nextInt();
            System.out.print("연산자를 입력하시오: ");
            operator = scanner.next().charAt(0);

            switch (operator){
                case '+':{
                    System.out.println(i+" + "+j+" = " + (i+j));
                    break;
                }
                case '-':{
                    System.out.println(i+" - "+j+" = " + (i-j));
                    break;
                }
                case '*':{
                    System.out.println(i+" * "+j+" = " + (i*j));
                    break;
                }
                case '/':{
                    if(j !=0) {
                        System.out.println(i + " / " + j + " = " + (i / j));
                        break;
                    } else{
                        System.out.println("0은 안됨");
                    }
                }
                default:{
                    System.out.println("연산자를 올바르게 작성하시오");
                }
                exit = scanner.nextLine().trim();
                if(exit.equals("exit")){
                    System.out.println("종료합니다.");
                    return;
                }
            }
        }

    }
}
