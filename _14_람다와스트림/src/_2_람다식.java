public class _2_람다식 {
    public static void main(String[] args) {
        Calculator cal = new Calculator() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        // ->
        Calculator cal2 = (a, b) -> (a+b);

        System.out.println(cal2.sum(2, 4));
    }
}
