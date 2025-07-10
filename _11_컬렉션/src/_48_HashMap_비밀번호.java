import java.util.HashMap;
import java.util.Scanner;

public class _48_HashMap_비밀번호 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap();
        map.put("qwe", "1235"); // id, 비번
        map.put("sss", "4315"); // id, 비번
        map.put("poi", "2235"); // id, 비번
        // id는 중복허용되지 않음

        Scanner scanner = new Scanner(System.in);

        System.out.println("id와 password를 입력하시오");
        System.out.println("id: ");
        String id = scanner.nextLine().trim();

        System.out.println("password: ");
        String password = scanner.nextLine().trim();
        System.out.println();

        if(!map.containsKey(id)){
            System.out.println("id가 존재하지 않습니다.");
        }
        if(!map.get(id).equals(password)){
            System.out.println("비밀번호가 일치하지 않습니다.");
        }else {
            System.out.println("일치합니다.");
        }
    }
}
