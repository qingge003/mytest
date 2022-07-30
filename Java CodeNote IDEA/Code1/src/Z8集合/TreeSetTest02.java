package Z8集合;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:
 */

/*
1.TreeSet集合底层实际上是一个TreeMap
2.TreeMap集合底层是一个二叉树
3.放到TreeSet集合的元素等同于放到TreeMap集合的key部分
4.TreeSet集合中的元素:无序不可重复,但是可以按照元素的大小顺序自动排序
    称为:可排序集合

 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("zhangsan");
        ts.add("lisi");
        ts.add("wangwu");
        ts.add("zhuliu");

        //遍历后自动升序排序
        for (String s : ts){
            System.out.println(s);
        }

        TreeSet<Integer> ts2 = new TreeSet<>();

        ts2.add(199);
        ts2.add(43);
        ts2.add(343);
        ts2.add(34);
        ts2.add(11);
        ts2.add(888);
        ts2.add(22);

        for (Integer integer : ts2){
            System.out.println(integer);
        }





    }


}
