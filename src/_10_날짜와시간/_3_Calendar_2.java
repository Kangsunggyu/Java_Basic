package _10_날짜와시간;

import java.util.Calendar;

public class _3_Calendar_2 {
    public static void main(String[] args) {
        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};

        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        calendar1.set(2002, 2, 4); // 과거로 날짜를 설정, 이 자바에서는 3월이 2 이기에 이따구로함
        System.out.println("과거는 " + toString(calendar1));
        System.out.println("오늘은 " + toString(calendar2));

        long time = (calendar2.getTimeInMillis() - calendar1.getTimeInMillis() ) / 1000; // 밀리초를 초로 변환

        System.out.println("지금까지의 초: " + time +"초");
        System.out.println("지금까지의 분: " + time/60 + "분");
        System.out.println("지금까지의 시: " + time/60/60 +"시");
        System.out.println("지금까지의 일: " + time/60/60/24 + "일");
        System.out.println("지금까지의 년: "+ time/60/60/24/365 + "년");

    }

    public static String toString(Calendar calendar) {
        return calendar.get(Calendar.YEAR) + "년 " + (calendar.get(Calendar.MONTH)+1) + "월 " + calendar.get(Calendar.DATE) + "일";
    }
}
