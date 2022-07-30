package Z8集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 泛型:
 * JDK8后引用了:自动类型推断机制(又称钻石表达式)
 */
public class GenericTest02 {
    public static void main(String[] args) {
        //
        List<Animal> myList = new ArrayList<>();

        myList.add(new Animal());
        myList.add(new Cat());
        myList.add(new Bird());

        Iterator<Animal> it =myList.iterator();
        while (it.hasNext()){
            Animal a = it.next();
            a.move();
        }

        List<String> strList = new ArrayList<>();
        strList.add("abc");
        strList.add("abc");
        strList.add("abc");

        Iterator<String> it2 = strList.iterator();
        while (it2.hasNext()){
            String s = it2.next();
            String newString = s.substring(2);
            System.out.println(newString);
        }

    }
}
