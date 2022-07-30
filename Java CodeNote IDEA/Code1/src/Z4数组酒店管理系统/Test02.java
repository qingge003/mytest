package Z4数组酒店管理系统;

/**
 * @author chenweidong
 * @date 2022/7/11 15:50
 * TODO:
 */
public class Test02 {
    public static void main(String[] args) {
        Room room2 = new Room(102,"单人间",true);
        System.out.println(room2.toString());
        System.out.println(room2);//打印对象自动调用toString方法
    }
}
