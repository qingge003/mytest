package Z12关于路径;
/**
 * @author chenweidong
 * @date 2022/7/26 18:11
 * TODO:研究文件路径问题
 */

import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 *
 */
public class AboutPath {
    public static void main(String[] args) throws FileNotFoundException {
        //这种路径方式缺点:移植性差,
       // FileReader reader = new FileReader("classinfo.properties");

        //使用以下通用方式获取文件:文件必须在类路径下
        //类路径:src路径下

        //Thread.currentThread() 当前线程
        //getContextClassLoader() 线程对象的方法,获取当前线程的类加载器对象
        //getResource("") 类加载器对象的方法,当前线程的类加载器默认从类的根路径在加载资源
       String path = Thread.currentThread().getContextClassLoader()
               .getResource("classinfo.properties").getPath();
        System.out.println(path);

        String path2 = Thread.currentThread().getContextClassLoader()
                .getResource("Z12关于路径/test.properties").getPath();
        System.out.println(path2);

        //以流的形式返回
        InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("Z12关于路径/test.properties");

    }
}
