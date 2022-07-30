package Z8集合;

/**
 * @author chenweidong
 * @date 2022/7/18 18:52
 * TODO:
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 1.List集合存储元素特点:有序可重复
 * 元素有下标,从0开始
 * 2.List接口特有方法:
 *  void add(int index, E element)   在列表的指定位置插入指定元素（可选操作）。
 *  Object get(int index)            返回列表中指定位置的元素。
 *  int indexOf(Object o)         返回此列表中第一次出现的指定元素的索引；如果此列表不包含该元素，则返回 -1。
 *  int lastIndexOf(Object o)     返回此列表中最后出现的指定元素的索引；如果列表不包含此元素，则返回 -1。
 *  Object remove(int index)       移除列表中指定位置的元素（可选操作）。
 *  Object set(int index, Object element)     用指定元素替换列表中指定位置的元素（可选操作）。
 */
public class ListTest01 {
    public static void main(String[] args) {
        List myList = new ArrayList();

        //默认向集合末尾添加元素
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");

        Iterator it = myList.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
        //获取指定下标元素
        Object firstobj = myList.get(0);
        System.out.println(firstobj);
        //根据下标遍历List集合
        for (int i = 0; i < myList.size() ; i++) {
            Object obj = myList.get(i);
            System.out.println(obj);
        }

        //获取下标获取指定元素
        System.out.println(myList.indexOf("B"));

        //获取最后一次出现的索引
        System.out.println(myList.lastIndexOf("C"));

        //根据下标删除指定索引元素
        myList.remove(0);
        System.out.println(myList.size());

        //将下标为2的元素修改为
        myList.set(2,"sort");
        for (int i = 0; i < myList.size() ; i++) {
            Object obj = myList.get(i);
            System.out.println(obj);
        }

    }
}
