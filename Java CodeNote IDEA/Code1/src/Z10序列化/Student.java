package Z10序列化;
/**
 * @author chenweidong
 * @date 2022/7/23 11:01
 * TODO:
 */

import java.io.Serializable;

/**
 *
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 343434343434343L;
    private int no;
    private String name;
    private String id;

    public Student() {
    }

    public Student(int no, String name) {
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
