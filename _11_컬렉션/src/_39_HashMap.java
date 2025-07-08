import java.util.HashMap;

public class _39_HashMap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(1, "경주");
        hm.put(2, "청주");
        hm.put(3, "진주");

        System.out.println("3 = " + hm.get(3));
        System.out.println(hm);
        System.out.println("Key = " + hm.keySet());
        System.out.println("Value = " + hm.values());
    }
}
