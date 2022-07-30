package Z8集合;
/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:
 */

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map接口:
 * 1.Map集合以key和value的方式存储数据,键值对key和value都是引用数据类型
 *  key和value都是存储对象的内存地址
 *  key起到主导地位,value是key的一个附属品
 *
 * 2.Map接口中常用方法:
 *  V put(K key, V value)  向Map集合中添加键值对
 *  void clear() 清空Map集合
 *  boolean containsKey(Object key)  判断是否包含某个key
 *  boolean containsValue(Object value)  判断是否包含某个value
 *  V get(Object key)  通过key获取value
 *  boolean isEmpty() 判断Map集合中元素个数是否为0
 *  Collection<V> values() 获取Map集合所有的values
 *  void putAll(Map<? extends K,? extends V> m) 从指定映射中将所有映射关系复制到此映射中（可选操作）。
 *  V remove(Object key) 删除一个键值对
 *  int size()  获取键值对数量
 *
 *  Set<K> keySet()  获取Map集合所有的key(所有的key是一个Set集合)
 *  Set<Map.Entry<K,V>> entrySet() 将Map集合转换为Set集合,Set集合中元素类型为 Map.Entry<K,V>
 */
public class HashMapTest02 {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(4,"猪妞");
        //通过key获取value
        String value = map.get(2);
        System.out.println(value);
        //获取键值对数量
        System.out.println("键值对数量:"+ map.size());
        //删除一个键值对
        map.remove(3);
        System.out.println("键值对数量:"+ map.size());


    }
}
