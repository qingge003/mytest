package Reflect;
/**
 * @author chenweidong
 * @date 2022/7/27 11:50
 * TODO:反射机制 获取类中属性 并修改
 */

import java.lang.reflect.Field;

/**
 * 通过反射机制访问一个java对象的属性,给属性赋值
 */
public class ReflectTest08 {
    public static void main(String[] args) throws Exception{
        Class studentClass = Class.forName("Reflect.Student");
        Object obj = studentClass.newInstance();//obj就是student对象

        /*
        反射机制修改类属性需要三要素:
        1.obj对象
        2.no属性
        3.22222值
         */
        Field noField = studentClass.getDeclaredField("no");//获取类中 no 属性
        noField.set(obj,22222);//给obj对象的no属性赋值22222

        Object noObj =noField.get(obj);//获取obj对象no属性的值
        System.out.println(noObj);

        /*
        获取类中private私有属性
         */
        Field nameField = studentClass.getDeclaredField("name");

        nameField.setAccessible(true);//打破封装,这样在外部也可以访问类中私有属性
        nameField.set(obj,"张三");
        System.out.println(nameField.get(obj));




    }
}
