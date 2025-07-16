package _10_날짜와시간;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// 태어난 날을 입력받아 며칠이 지났는지 출력
public class _연습문제_3 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        sdf.setLenient(false); // 엄격한 형식 체크

        Scanner scanner = new Scanner(System.in);
        System.out.print("태어난 날짜를 입력하세요 (yyyy/MM/dd): ");
        String input = scanner.nextLine();

        try {
            Date birthDate = sdf.parse(input); // 태어난 날 파싱
            Date today = new Date(); // 현재 날짜

            long diffInMillis = today.getTime() - birthDate.getTime();
            long diffInDays = diffInMillis / (24 * 60 * 60 * 1000);

            System.out.println("태어난 날부터 오늘까지 " + diffInDays + "일이 지났습니다.");
        } catch (ParseException e) {
            System.out.println("입력 형식이 잘못되었습니다. yyyy/MM/dd 형식으로 입력해주세요.");
        }
    }
}
