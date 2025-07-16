package _10_날짜와시간;
import java.util.Calendar;

public class _연습문제_1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("2025년 매 월 두 번째 일요일의 날짜:");

        for (int month = 0; month < 12; month++) {
            int sundayCount = 0;

            for (int day = 1; day < 15; day++) {
                calendar.set(2025, month, day);

                if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                    sundayCount++;
                }

                if (sundayCount == 2) {
                    System.out.println(toString(calendar));
                    break;
                }
            }
        }
    }

    public static String toString(Calendar calendar) {
        return calendar.get(Calendar.YEAR) + "년 " +
                (calendar.get(Calendar.MONTH) + 1) + "월 " +
                calendar.get(Calendar.DATE) + "일";
    }
}