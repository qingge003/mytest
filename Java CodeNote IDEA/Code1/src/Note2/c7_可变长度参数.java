package Note2;
/**
 * @author chenweidong
 * @date 2022/7/27 12:15
 * TODO:可变长度参数 (掌握)
 */

/** 可变长度参数形式:  int... args
 * 1.对参数个数没有要求 0~n
 * 2.可变长度参数只能出现在列表最后一个,且只能有一个
 * 3.可变长度参数是一个数组,可以传一个数组进去
 */
public class c7_可变长度参数 {
}

class ArgsTest{
    public static void main(String[] args) {
        m();
        m(10);
        m(10,10,10,10,10,10,10);

        m2("张三");

        m3("a","b","c","d");
        String [] strs = {"a","b","c","d"};
        m3(strs);

    }

    public static void m(int...args) {
        System.out.println("m方法执行");
    }
    public static void m2(String s,int...args) {
        System.out.println("m2方法执行");
    }
    public static void m3(String...args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
