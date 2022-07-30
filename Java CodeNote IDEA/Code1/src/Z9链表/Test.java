package Z9链表;

import Z9链表.Link;

/**
 * @author chenweidong
 * @date 2022/7/19 15:56
 * TODO:
 */
public class Test {
    public static void main(String[] args) {
        //创建集合对象
        Link link = new Link();
        //添加元素
        link.add(100);
        link.add(200);
        link.add(300);
        //打印长度
        System.out.println(link.size());


    }
}
