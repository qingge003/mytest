package Z10序列化;
/**
 * @author chenweidong
 * @date 2022/7/23 11:03
 * TODO:序列化
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 1.参与序列化和反序列化的对象必须实现 Serializable 接口
 * 2.Serializable 起到一个标志的作用,java虚拟机看到类实现这个接口,就会对该类
 * 自动生成一个序列化版本号,版本号用来区分类
 * 3.凡是实现Serializable,需要手动赋值一个序列版本号:
 *  private static final long serialVersionUID = 343434343434343L;
 *  这样类修改后还是可以反序列化回来
 *
 */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws Exception {
        Student s = new Student(1111,"zhangsan");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));

        oos.writeObject(s);
        oos.flush();
        oos.close();

    }

}
