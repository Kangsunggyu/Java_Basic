package _10_날짜와시간;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _14_simpleDateFormat {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4, sdf5, sdf6, sdf7, sdf8, sdf9;

        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("yy년 MMM dd일 E요일");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");

        sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
        sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
        sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");
        sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 주입니다.");
        System.out.println(sdf1.format(date));
        System.out.println(sdf2.format(date));
        System.out.println(sdf3.format(date));
        System.out.println(sdf4.format(date));
        System.out.println(sdf5.format(date));
        System.out.println(sdf6.format(date));
        System.out.println(sdf7.format(date));
        System.out.println(sdf8.format(date));
    }
}
