package Z12关于路径;
/**
 * @author chenweidong
 * @date 2022/7/26 18:33
 * TODO:
 */

import java.util.ResourceBundle;

/**
 * java.util包下提供了一个资源绑定器,便于获取属性配置文件的内容
 * 使用以下这种方式的时候,属性配置文件xxx.properties必须放到类路径下
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        //扩展名不写
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo");

        String className = bundle.getString("className2");
        System.out.println(className);

    }
}
