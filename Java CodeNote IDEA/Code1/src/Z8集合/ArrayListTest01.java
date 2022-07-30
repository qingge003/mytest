package Z8集合;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList集合:
 * 1.默认初始化容量为10
 * 2.集合底层是一个object[]数组
 * 3.建议给定一个预估的容量,尽量减少扩容次数
 * 4.ArrayList是所有集合中使用频率最高的集合,因为往数组末尾添加元素,效率不受影响
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        System.out.println(list1.size());

        list1.add("zhangsan");
        list1.add("lisi");
        list1.add("wangwu");
        list1.add("zhuliu");

        for (int i = 0; i < list1.size() ; i++) {
            Object s = list1.get(i);
            System.out.println(s);

        for (Object s2 : list1){
            System.out.println(s2);
        }

        }
    }
}

