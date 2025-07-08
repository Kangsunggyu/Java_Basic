import java.util.ArrayList;

public class _3_다형성 {
    public static void main(String[] args) {
        ArrayList<_3_product> pList = new ArrayList<>();
        ArrayList<_3_tv> tList = new ArrayList<>();

        // 이게 가능하다.
        pList.add(new _3_tv());
        pList.add(new _3_audio());

        printAll(pList);



    }
    static void printAll(ArrayList<_3_product> list){
        for (_3_product p : list){
            System.out.println(p);
        }
    }
}
class _3_product{}
class _3_tv extends _3_product{}
class _3_audio extends _3_product{}