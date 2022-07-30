package Reflect;
/**
 * @author chenweidong
 * @date 2022/7/27 10:47
 * TODO:通过反射机制,反编译一个类的属性Field,即获取一个类的所有属性 (了解)
 */

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Class.getSimpleName() 获取类名
 * Modifier.toString(studentClass.getModifiers()) 获取类修饰符
 */
public class ReflectTest07 {
    public static void main(String[] args) throws Exception {
        StringBuilder s = new StringBuilder();
        Class studentClass = Class.forName("java.lang.String");
        s.append(Modifier.toString(studentClass.getModifiers()) +" class "+studentClass.getSimpleName()+ " {\n");
        Field[] fields = studentClass.getDeclaredFields();
        for (Field field :fields
             ) {
            s.append("\t");
            s.append(Modifier.toString(field.getModifiers()));//获取修饰符
            s.append(" ");
            s.append(field.getType().getSimpleName());//获取属性类型
            s.append(" ");
            s.append(field.getName());//获取属性名
            s.append(";");
            s.append("\n");
        }
        s.append("}");
        System.out.println(s);
    }
}
