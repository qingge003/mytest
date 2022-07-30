package Reflect;
/**
 * @author chenweidong
 * @date 2022/7/27 12:30
 * TODO:反射Method   (了解)
 */

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 *
 */
public class ReflectTest09 {
    public static void main(String[] args) throws Exception{
        Class userServiesClass = Class.forName("Reflect.UserService");

        Method[] methods = userServiesClass.getDeclaredMethods();//获取类中所有方法
        //System.out.println(methods.length);//2

        //遍历方法
        for (Method method : methods) {
            System.out.println(Modifier.toString(method.getModifiers()));//获取方法修饰符
            System.out.println(method.getReturnType().getSimpleName());//获取方法返回值类型
            System.out.println(method.getName());//获取方法名
            //获取方法 参数列表
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                System.out.println(parameterType.getSimpleName());

            }
        }


    }

}
