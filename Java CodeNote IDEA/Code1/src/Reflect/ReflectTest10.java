package Reflect;
/**
 * @author chenweidong
 * @date 2022/7/27 15:48
 * TODO:通过反射调用类中方法
 */

import java.lang.reflect.Method;

/**
 *
 */
public class ReflectTest10 {
    public static void main(String[] args) throws Exception {
        //
        Class userServiesClass = Class.forName("Reflect.UserService");
        //创建对象
        Object obj = userServiesClass.newInstance();
        /*
        调用对象方法四要素:
        1.obj对象
        2.实参
        3.返回值
        4.方法
         */
        Method loginMethod = userServiesClass.getDeclaredMethod("login",String.class,String.class);
        Object retValue = loginMethod.invoke(obj,"admin","123");
        System.out.println(retValue);




    }
}
