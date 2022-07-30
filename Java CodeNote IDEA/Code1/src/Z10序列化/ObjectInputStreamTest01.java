package Z10序列化;
/**
 * @author chenweidong
 * @date 2022/7/23 11:16
 * TODO:反序列化
 */

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students"));
        Object obj = ois.readObject();
        System.out.println(obj);
        ois.close();
    }
}
