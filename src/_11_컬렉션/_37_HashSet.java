package _11_컬렉션;

import java.util.HashSet;
import java.util.Iterator;

public class _37_HashSet {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyu = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");
        setA.add("2");
        setA.add("3");
        setA.add("4");
        setA.add("5");

        setB.add("4");
        setB.add("5");
        setB.add("6");
        setB.add("7");
        setB.add("8");

        System.out.println("A = " + setA);
        System.out.println("B = " + setB);

        Iterator it = setB.iterator();
        while (it.hasNext()){
        /*    if(setA.contains(it.next())){
                setKyu.add(it.next());
            }
            이런 식이면 it.next가 두 번 반복되어 원하는 값이 나오지 않음
         */
            Object temp = it.next(); // 요소 1개만 꺼냄
            if (setA.contains(temp)) {
                setKyu.add(temp);
            }
        }
        System.out.println("교집합= "+setKyu);

        it = setA.iterator();
        while (it.hasNext()){
            setHab.add(it.next());
        }
        it = setB.iterator();
        while (it.hasNext()){
            setHab.add(it.next());
        }
        System.out.println("합집합= " + setHab);

        it = setB.iterator();
        while (it.hasNext()){
            Object temp = it.next();
            if(!setA.contains(temp)){
                setCha.add(temp);
            }
        }
        System.out.println("차집합= " + setCha);
    }
}
