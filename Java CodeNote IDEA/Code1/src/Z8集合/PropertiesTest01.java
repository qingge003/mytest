package Z8集合;
/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:
 */

import java.util.Properties;

/** 属性类:
 * Properties 是线程安全的，因为继承Hashtable,
 * 另外Properties存储元素的时候也是采用key和valuel的形式存储，
 * 并且key和value只支持String类型，不支持其它类型。Properties被称为属性类。
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        Properties pro = new Properties();
        //使用set和get方法
        pro.setProperty("url","jdbc:mysql://localhost:3306");
        pro.setProperty("driver","com.mysql.jdbc.Driver");
        pro.setProperty("username","root");
        pro.setProperty("password","123");


        String url = pro.getProperty("url");
        String driver = pro.getProperty("driver");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");

        System.out.println(url);
        System.out.println(driver);
        System.out.println(username);
        System.out.println(password);
    }
}
