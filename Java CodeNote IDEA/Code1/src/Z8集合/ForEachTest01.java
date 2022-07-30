package Z8集合;

/**
 * JDK5.0后推出的新特性:增强for循环,也叫foreach
 */
public class ForEachTest01 {
    public static void main(String[] args) {

        int [] arr = {12,12,243,354,45,3};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //增强for循环没有下标
        for (int data : arr){
            System.out.println(data);
        }
    }
}
