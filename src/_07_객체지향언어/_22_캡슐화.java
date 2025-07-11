package _07_객체지향언어;

public class _22_캡슐화 {
    public static void main(String[] args) {
        _22_Time t = new _22_Time();

        t.setHour(15); // 정상 값
        System.out.println("hour: " + t.getHour()); // 출력: 15

        t.setHour(25); // 잘못된 값 (무시됨)
        System.out.println("hour: " + t.getHour()); // 출력: 15
    }
}

class _22_Time{
    private int hour;
    private int minute;
    private int second;

    public int getHour(){
        return hour;
    }
    public void setHour(int hour){
        if (hour < 0|| hour > 23){
            return;
        }else {
            this.hour = hour;
        }
    }
}
