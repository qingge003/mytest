package Reflect;
/**
 * @author chenweidong
 * @date 2022/7/26 20:43
 * TODO:反射属性 Field (了解)
 */

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 反射Student类中所有的Field:
 *   getFields() 获取所有public属性,返回一个Field数组
 *   getDeclaredFields() 获取所有属性,返回一个Field数组
 */
public class ReflectTest06 {
    public static void main(String[] args) throws Exception {
        Class studentClass = Class.forName("Reflect.Student");

//        Field [] fields = studentClass.getFields();//获取所有public属性,返回一个Field数组
//        System.out.println(fields.length);
//        Field f = fields[0];
//        String fieldName = f.getName();
//        System.out.println(fieldName);

            //获取所有Field
            Field [] fields2 = studentClass.getDeclaredFields();//获取所有属性,返回一个Field数组
            for (Field field : fields2) {
                //获取属性的类型
            Class fieldType = field.getType();
            String fName = fieldType.getName();
            System.out.println(fName);
            //获取属性的名字
            System.out.println(field.getName());

            //获取属性修饰符列表
            int i = field.getModifiers();
            System.out.println(i);
            String modifierString = Modifier.toString(i);
            System.out.println(modifierString);

        }


    }
}
