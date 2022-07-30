package Z8集合;
/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:
 */

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet无序不可重复 存进去和取出来的数据顺序不一样,不存在下标
 */
public class TreeSetTest01 {
    public static void main(String[] args) {

        Set<String> strs = new TreeSet<>();

        //遍历后会从小到大自动排序
        strs.add("A");
        strs.add("B");
        strs.add("Z11线程死锁");
        strs.add("Y");
        strs.add("Z11线程死锁");
        strs.add("K");
        strs.add("M");
        System.out.println(strs.size());

        for (String s : strs){
            System.out.println(s);
        }


    }
}
