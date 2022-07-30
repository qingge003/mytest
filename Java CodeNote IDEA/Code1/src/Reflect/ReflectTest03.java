package Reflect;
/**
 * @author chenweidong
 * @date 2022/7/25 20:25
 * TODO:反射机制
 */

/**
 * 通过反射机制获取Class,通过Class实例化对象
 */
public class ReflectTest03 {
    public static void main(String[] args) {
        //通过反射机制获取Class,通过Class实例化对象
        try {
            Class c =  Class.forName("Reflect.User");
            //newInstance()这个方法会调用user这个类的无参构造方法,完成对象的创建
            Object obj = c.newInstance();
            System.out.println(obj);

        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
class User {
    public User(){
        System.out.println("无参构造方法");
    }
    public void dosome(){
        System.out.println("dosome");

    }


}
