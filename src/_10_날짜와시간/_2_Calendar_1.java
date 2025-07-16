package _10_날짜와시간;
import java.util.Calendar;

public class _2_Calendar_1 {
    public static void main(String[] args) {
        // 추상클래스이기에 getInstance(); 로 얻어야 한다.

        Calendar today = Calendar.getInstance(); // 현재 날짜와 시간으로 세팅

        System.out.println("이 해의 년도: " + today.get(Calendar.YEAR));
        System.out.println("현재 월: " + (today.get(Calendar.MONTH) + 1)); // 1월이 0인 신기한 자바
        System.out.println("이 해의 몇째 주: " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 달의 몇째 주: " + today.get(Calendar.WEEK_OF_MONTH));
        System.out.println("아 해의 몇 일: " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("이 달의 몇 일: " + today.get(Calendar.DATE));

        System.out.println();

        System.out.println("요일: " + today.get(Calendar.DAY_OF_WEEK) ) ; // 1: 일요일, 2: 월, 3: 화
        System.out.println("시간(0~11): " + today.get(Calendar.HOUR));
        System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("분(0~59):" + today.get(Calendar.MINUTE));
        System.out.println("초(0~59):" + today.get(Calendar.SECOND));

        System.out.println();

        System.out.println("이 달의 마지막날: " + today.getActualMaximum(Calendar.DATE));



    }
}
