package Z8集合;

import java.util.TreeSet;

/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:对VIP用户进行名字和年龄排序:
 *  类实现Comparable接口,调用compareTo方法自定义排序逻辑
 */
/*

*/
public class TreeSetTest03 {
    public static void main(String[] args) {
        TreeSet<Vip> vips = new TreeSet<>();

        vips.add(new Vip("zhangsi",20));
        vips.add(new Vip("zhangsan",20));
        vips.add(new Vip("king",18));
        vips.add(new Vip("soft",17));
        for (Vip vip : vips){
            System.out.println(vip);
        }

    }
}
class Vip implements Comparable<Vip>{
    String name;
    int age;

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
        /*
        compareTo方法的返回值很重要:
        返回0表示相同,value会覆盖;
        返回>0会继续在右子树上找
        返回<0会继续在左子树上找
        */
    @Override
    public int compareTo(Vip v) {
        if(this.age == v.age){
            //年龄相同时按照名字排序
            //姓名是String类型,可以直接比,调用compareTo来完成比较
            return this.name.compareTo(v.name);
        }
        else{
            return this.age - v.age;
        }
    }
}

