package Z8集合;

import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList也存在下标
 *
 */
public class LinkedListTest01 {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(100);
        list.add(200);
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.println(obj);

        }
    }

}
