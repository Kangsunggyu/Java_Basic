package _10_날짜와시간;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// "yyyy/MM/dd" 형식으로 입력받아 무슨 요일인지 출력
// 입력 형식이 잘못되면 오류 출력
public class _연습문제_2 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        Scanner scanner = new Scanner(System.in);
        System.out.print("날짜 입력 (yyyy/MM/dd): ");
        String input = scanner.nextLine();

        try {
            Date date = sdf.parse(input); // 형식 파싱 시도, 여기서 맞는지 아닌지 판단
            // 무슨 요일인지 출력하기 위한 패턴
            SimpleDateFormat dayFormat = new SimpleDateFormat("E"); // E: 요일 출력
            String dayOfWeek = dayFormat.format(date);
            System.out.println("입력하신 날짜는 " + dayOfWeek + "요일 입니다.");
        } catch (ParseException e) {
            System.out.println("입력 형식이 잘못되었습니다. yyyy/MM/dd 형식으로 입력해주세요.");
        }
    }
}
