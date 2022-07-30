package Z9链表;

/**
 * @author chenweidong
 * @date 2022/7/19 10:44
 * TODO:
 */

/**
 * 单向链表:
 * 对于链表数据结构来说:基本的单元是节点Node
 * 对于单向链表来说,任何一个节点Node中都有两个属性:
 * 第一.存储的数据 第二.下一节点的内存地址
 * 链表优点:随机增删元素效率较高(因为删减元素不涉及大量元素位移)
 * 链表缺点:查询效率较低,每一次查找某个元素的时候,都需要从头节点开始往下遍历
 *
 * 双向链表:
 * 基本单元是Node,
 * 对于双向链表来说,任何任何一个节点Node中都有两个属性:
 * 第一.存储的数据 第二.上一节点的内存地址 第三.下一节点的内存地址
 *
 */
public class Node {
    //存储的数据
    Object date;

    Node next;
    public Node(){

    }
    public Node(Object element,Node next){
        this.date = element;
        this.next = next;
    }



}
