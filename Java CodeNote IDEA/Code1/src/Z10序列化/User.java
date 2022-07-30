package Z10序列化;
/**
 * @author chenweidong
 * @date 2022/7/23 11:01
 * TODO:
 */

import java.io.Serializable;

/**
 * transient表示游离的,不参与序列化
 */
public class User implements Serializable {
    private int no;
    private transient String name;

    public User() {
    }

    public User(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
