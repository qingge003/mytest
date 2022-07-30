package Reflect;
/**
 * @author chenweidong
 * @date 2022/7/25 16:34
 * TODO:反射机制
 */

import java.util.Date;

/** 要操作一个类的字节码,需要获取到这个类的字节码,怎么获取java.lang.class实例?
 * 三种方式:
 * 第一种：
 * 		Class c = Class.forName("完整类名");
 * 第二种：
 * 		Class c = 对象.getClass();
 * 第三种：
 * 	    Class c = int.class;
 * 		Class c = String.class;
 *
 */
public class ReflectTest02 {
    public static void main(String[] args) {

        /*
        第一种:Class.forName()方法:
        1.静态方法
        2.参数是一个字符串
        3.字符串是一个完整类名
         */
        Class c1 = null;
        Class c2 = null;
        try {
            c1 = Class.forName("java.lang.String");
            c2 = Class.forName("java.util.Date");
            Class c3 = Class.forName("java.lang.System");

        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }

        /*
        java中任何一个对象都有一个方法:getClass()方法

         */
        String s = "abc";
        Class x = s.getClass();
        System.out.println(c1 == x);//双等号判断的是内存地址

        Date time = new Date();
        Class x2 = time.getClass();
        System.out.println(c2 == x2);

    }
}
