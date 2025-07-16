package _10_날짜와시간;

import java.util.Calendar;

public class _5_Calendar_4_달력 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR); // 현재 년도
        int month = calendar.get(Calendar.MONTH); // 현재 달

        int eDay = calendar.getActualMaximum(Calendar.DATE); // 마지막날

        Calendar sDay = Calendar.getInstance();
        sDay.set(year, month, 1);
        int start_day_of_week = sDay.get(Calendar.DAY_OF_WEEK); // 첫째날이 무슨 요일인지에 대해
        System.out.println(start_day_of_week);
        System.out.println("         "+ year + "년 "+ (month + 1) + "월" );
        System.out.println(" SUN MON TUE WED THU FRI SAT");

        for (int i = 1; i < start_day_of_week; i++) { // 첫째날부터 출력
            System.out.print("    ");
        }
        for (int i = 1, n = start_day_of_week; i <= eDay; i++, n++) {
            System.out.print( (i<10 )? "  " + i : " "+ i);
            System.out.print( (n % 7 == 0) ? "\n" : " ");
        }
    }
}
