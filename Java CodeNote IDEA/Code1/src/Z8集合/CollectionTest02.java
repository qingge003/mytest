package Z8集合;

/**
 * @author chenweidong
 * @date 2022/7/17 21:03
 * TODO:
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**关于集合遍历/迭代   重点
 *
 *
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        //以下遍历方式是所有Collection通用的一种方式,在Map集合中不能用
        Collection c = new ArrayList();
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(100);
        c.add(new Object());
        //对集合迭代
        //第一步:获取集合对象的迭代器对象Iterator
        //注意:当集合结构发生改变,如删除元素,增加元素,迭代器需要重新获取,否则会发生异常
        Iterator it =  c.iterator();
        //第二步:通过获取的迭代对象开始迭代
        /*
        Iterator中的方法:
        boolean hasNext()   如果仍有元素可以迭代，则返回 true。
        Object next()            返回迭代的下一个元素,让迭代器前进一位
        void remove()       从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。*/
        while (it.hasNext()){
            Object obj = it.next();
            it.remove();
            System.out.println(obj);
        }
        System.out.println(c.size());

    }



}
