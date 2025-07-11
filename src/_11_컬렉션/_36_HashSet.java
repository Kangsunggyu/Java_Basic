package _11_컬렉션;

import java.util.HashSet;

public class _36_HashSet {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc"); // 중복이라 저장안됨
        set.add(new Person("Davod", 10));
        set.add(new Person("Davod", 10));
        System.out.println(set);

    }
}
class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", "+ age;
    }




    // 이를 정의해야 한다. 복붙해라
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}
