package Z8集合;
/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:
 */

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet集合中元素可排序的第二种方式:使用比较器的方式
 */
public class TreeSetTest04 {
    public static void main(String[] args) {

        //创建比较器对象
        TreeSet<WuGui> wuGuis = new TreeSet<>(new WuGuiComparator());

        wuGuis.add(new WuGui(12));
        wuGuis.add(new WuGui(1));
        wuGuis.add(new WuGui(2));
        wuGuis.add(new WuGui(50));
        wuGuis.add(new WuGui(100));

        for (WuGui wugui : wuGuis){
            System.out.println(wugui);
        }


    }
}
class WuGui{
    int age;
    public WuGui(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "小乌龟{" +
                "age=" + age +
                '}';
    }
}
//创建乌龟比较器
class WuGuiComparator implements Comparator<WuGui>{

    @Override
    public int compare(WuGui o1, WuGui o2) {
        //指定比较规则

        return o1.age - o2.age;
    }
}
