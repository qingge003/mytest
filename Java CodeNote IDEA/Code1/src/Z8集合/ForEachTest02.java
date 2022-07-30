package Z8集合;

/**
 * @author chenweidong
 * @date 2022/7/19 22:51
 * TODO:
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 集合使用foreach
 */
public class ForEachTest02 {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();

        strList.add("hello");
        strList.add("world");
        strList.add("java");
        //遍历集合
        Iterator<String> it = strList.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        //使用下标遍历集合
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
        //使用foreach遍历集合
        for (String s : strList){
            System.out.println(s);

        }
    }





}
