package Z8集合;
/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的遍历
 */
public class HashMapTest03 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(4,"猪妞");

        //第一种方法:key是Set集合,获取所有的key,通过遍历key来遍历value
        Set<Integer> keySet = map.keySet();


//        Iterator<Integer> it = keySet.iterator();
//        while (it.hasNext()) {
//            //获取其中一个key
//            Integer key = it.next();
//            //通过key获取value
//            String value = map.get(key);
//            System.out.println(value);
//        }


        //第二种方法:通过foreach
//            for (Integer key : keySet){
//                System.out.println(key + "=" + map.get(key));
//            }

        //第三种方法:调用Map集合的entrySet()方法,返回Set集合,Set集合中元素类型是Map.Entry
        Set<Map.Entry<Integer,String>> keyset2 = map.entrySet();
        Iterator<Map.Entry<Integer,String>> it = keyset2.iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String> node = it.next();//node是Map.Entry类型的引用
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + "=" + value);
        }

        //第四种方法:通过foreach 效率最高,适合大数据量***********************
        for (Map.Entry<Integer,String> node : keyset2){
            System.out.println(node.getKey()+ "=" + node.getValue());
        }






        }
}
