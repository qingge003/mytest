package Atest;

/**
 * @author chenweidong
 * @date 2022/7/3 11:12
 * TODO:
 */
public class people {
    int age = 3;
    String name = "陈伟东";

    public people(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
