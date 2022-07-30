package Z10序列化;
/**
 * @author chenweidong
 * @date 2022/7/23 11:19
 * TODO:一次序列化多个对象,使用List集合存储多个对象
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws Exception {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"张三"));
        userList.add(new User(2,"李四"));
        userList.add(new User(3,"王五"));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users"));
        oos.writeObject(userList);
        oos.flush();
        oos.close();


    }
}
