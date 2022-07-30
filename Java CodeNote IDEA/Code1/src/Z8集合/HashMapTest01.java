package Z8集合;
/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:HashMap集合:
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap集合:
 *  1.HashMap集合底层是哈希表的数据结构
 *  2.哈希表是数组和单向链表的结合体:
 *      数组:查询效率高,随机增删效率低
 *      链表:查询效率低,随机增删效率高
 *      哈希表将两者的数据结构融合在一起,充分发挥他们各自的优点
 *  3.同一个单向链表中所有节点的hash相同,因为他们的数组下标一样
 *   但在同一个链表上k和k的equals方法肯定返回false
 *   4.HashMap允许key为null
 *   */
/*HashMap底层代码:
  public class HashMap{
        //底层是一维数组
      Node<K,V>[] table;
        //静态内部类HashMap.Node
      static class Node<K,V>  {
      final int hash;//哈希值是key的HashCode()方法的执行结果
      final K key;//存储到Map集合中的那个key
      V value;//存储到Map集合中的那个value
      Node<K,V> next;//下一节点的内存地址
     }*/


public class HashMapTest01 {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(1111,"zhangsan");
        map.put(6666,"lisi");
        map.put(7777,"wagnwu");
        map.put(2222,"zhaoliu");
        map.put(2222,"king");

        System.out.println(map.size());

        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer,String> entry : set) {
            System.out.println(entry.getKey() + "=" + entry.getValue());

        }
    }



}
