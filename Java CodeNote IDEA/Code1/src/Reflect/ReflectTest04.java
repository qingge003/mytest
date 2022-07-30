package Reflect;
/**
 * @author chenweidong
 * @date 2022/7/25 22:03
 * TODO:反射机制
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/** 反射机制让程序更灵活:
 * 代码不需要改动,只需要修改配置文件,就可以修改实例类
 */
public class ReflectTest04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        //通过IO流读取classinfo.properties文件
        FileReader reader = new FileReader("Code1/src/classinfo.properties");

        Properties pro = new Properties();
        pro.load(reader);
        reader.close();
        //在属性文件中通过key获取value
        String className = pro.getProperty("className2");
        System.out.println(className);
        //获取实例类
        Class c = Class.forName(className);
        Object obj = c.newInstance();
        System.out.println(obj);

    }
}
