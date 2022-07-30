package Reflect;
/**
 * @author chenweidong
 * @date 2022/7/26 18:06
 * TODO:forName(" ")方法
 */

/**
 * forName("Reflect.MyClass")会进行类加载,
 * 如果只是希望类的静态代码块执行,其他代码一律不执行,可以使用Class.forName("Reflect.MyClass");
 */
public class ReflectTest05 {
    public static void main(String[] args) {
        try {
            Class.forName("Reflect.MyClass");


        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }


    }
}

class MyClass{
    static{
        System.out.println("MyClass类的静态代码块执行");

        }


}