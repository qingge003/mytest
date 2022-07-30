package Z8集合;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 深入研究 boolean contains(Object o) 判断集合中是否包含某个元素
 *          boolean remove(Object o) 删除集合中某个元素
 * 底层调用了equals方法
 */
public class CollectionTest03 {
    public static void main(String[] args) {
//        Collection c = new ArrayList();
//        String s1 = new String("abc");
//        c.add(s1);
//        String s2 = new String("def");
//        c.add(s2);
//
//        System.out.println("元素的个数是:" + c.size());
//
//        String x = new String("abc");
//        System.out.println(x.equals("abc"));
//        System.out.println(c.contains(x));

        //删除s4的时候就是删除s3
        Collection cc = new ArrayList();
        String s3 = new String("hello");
        cc.add(s3);
        String s4 = new String("hello");
        cc.remove(s4);
        System.out.println(cc.size());



    }
}
