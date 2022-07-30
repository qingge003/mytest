package Z9链表;

/**
 * 单向链表
 */
public class Link {
    //
    Node header = null;

    int size = 0;

    public int size(){
        return size;
    }

    //向链表中添加元素的方法
    public void add(Object data){
        if (header == null) {
            header = new Node(data,null);
        }
        else{
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(data,null);

        }
        size++;

    }
    private Node findLast(Node node){
        if (node.next == null) {
            return node;
        }
        return findLast(node.next);

    }
    //删除链表中某个数据的方法
    public void remove(Object obj){

    }
    //修改链表中某个数据的方法
    public void modify(Object newobj){

    }
    //查找链表中某个元素的方法
    public int find(Object obj){
        return 0;

    }
}
