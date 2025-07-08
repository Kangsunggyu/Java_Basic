import java.util.HashMap;

public class _7_HashMap {
    public static void main(String[] args) {
        HashMap<String, _6_Student> map = new HashMap<>();
        map.put("1_1", new _6_Student("강", 1, 1));

        _6_Student s_1_1 = map.get("1_1");
        System.out.println(s_1_1.name);
        System.out.println(map.get("1_1").number);
    }
}

