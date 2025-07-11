package _07_객체지향언어;

public class _31_추상클래스 {
    public static void main(String[] args) {
        Player p = new AudioPlayer();
        p.play(100);
    }
}
abstract class Player{
    abstract void play(int pos);
    abstract void stop();
}
class AudioPlayer extends Player{
    void play(int pos){
        System.out.println("start" + pos);
    }
    void stop(){
        System.out.println("stop");
    }
}