package Z8集合;

/**
 * @author chenweidong
 * @date 2022/7/17 18:13
 * TODO:
 */

import java.util.ArrayList;
import java.util.Collection;

/**
 *关于java.util.Collection接口中常用的方法:
 * 1.Collection中能存放什么元素?
 *  没有使用"泛型"前,Collection中可以存储Object的所有子类型
 *  使用了"泛型"之后,Collection只能存储某个具体的类型
 *  集合中不能直接存储基本数据类型,也不能存储java对象,只能存储java对象的内存地址
 * 2.Collection常用方法:
 *  boolean add(Object e) 向集合中添加元素
 *  int size() 获取集合中元素的个数
 *  void clear() 清空集合
 *  boolean contains(Object o) 判断集合中是否包含某个元素
 *  boolean remove(Object o) 删除集合中某个元素
 *  boolean isEmpty() 判断是否为空
 *  Object[] toArray() 将集合转为数组
 *
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(1);//自动装箱
        c.add(3.14);
        c.add(new Object());
        c.add(true);

        System.out.println("集合中的元素:" + c.size());//获取集合中元素的个数

        //清空集合
        c.clear();
        System.out.println("集合中的元素:" + c.size());//获取集合中元素的个数

        c.add("hello");
        c.add("world");
        c.add("绿巨人");

        //判断集合中是否包含"绿巨人"
        boolean flag = c.contains("绿巨人");
        System.out.println(flag);
        boolean flag2 = c.contains("绿巨人2");
        System.out.println(flag2);

        //删除集合中某个元素
        c.remove("hello");
        System.out.println("集合中的元素:" + c.size());//获取集合中元素的个数

        //清空所有元素
        c.removeAll(c);
        System.out.println("集合中的元素:" + c.size());//获取集合中元素的个数
        //判断是否为空
        boolean flag3 = c.isEmpty();
        System.out.println(flag3);

        //集合转换为数组
        c.add("a");
        c.add("b");
        c.add("100");
        c.add("c");
        Object[] objs = c.toArray();
        for (int i = 0; i <4 ; i++) {
            System.out.println(objs[i]);
        }







    }
}
