package _10_날짜와시간;

import java.util.Calendar;

public class _4_Calendar_3_날자설정 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.HOUR_OF_DAY, 22);
        calendar.set(Calendar.MINUTE, 10);
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + "시 " + calendar.get(Calendar.MINUTE) + "분");

        calendar.set(2002, 3, 4); // 과거로 날짜를 설정
    }
}
