package IO;
/**
 * @author chenweidong
 * @date 2022/7/23 11:59
 * TODO:
 */

import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.Properties;

/**
 * IO 和 Properties属性类 联合应用
 *
 * 经常变化的信息,建议存在属性文件中,
 *
 * 类似以上机制的文件称为配置文件,当配置文件出现 key1 = value 格式的时候,这种配置文件称为属性配置文件
 * java中属性配置文件以.properties结尾
 *
 */
public class IoPropertiesTest01 {
    public static void main(String[] args) throws Exception {
        /*
        Properties是一个Map集合,key和value都是String类型,
        将userinfo文件中的数据加载到Properties对象中

         */
//新建一个输入流对象
        FileReader reader = new FileReader("Code1/src/userinfo");
        //新建一个Map集合
        Properties pro = new Properties();
        //调用Properties对象的load方法将文件中的数据加载到Map集合中,等号左边做key,等号右边做value
        pro.load(reader);

        String username = pro.getProperty("username");
        System.out.println(username);

        String password = pro.getProperty("password");
        System.out.println(password);
    }
}

