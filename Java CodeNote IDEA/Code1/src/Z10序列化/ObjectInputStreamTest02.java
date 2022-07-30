package Z10序列化;
/**
 * @author chenweidong
 * @date 2022/7/23 11:28
 * TODO:一次反序列化多个对象
 */

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 *
 */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users"));
        List<User> userList = (List<User>)ois.readObject();
        for (User user: userList) {
            System.out.println(user);

        }
        ois.close();
    }
}
