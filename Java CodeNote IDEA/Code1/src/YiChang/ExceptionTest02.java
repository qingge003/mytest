package YiChang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 抛出异常可以抛出对应异常的父类异常
 * catch写多个必须从小到大,从上往下写
 *
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        System.out.println("main begin");
        try{
            m1();
            System.out.println("hello world");
        }
        catch(FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();//打印异常信息
        }

        System.out.println("main over");
    }

    private static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    private static void m2() throws FileNotFoundException {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }

    private static void m3()throws FileNotFoundException {
        System.out.println("m3 begin");
        new FileInputStream("D:\\QQ接收文件");//写入一个文件路径
        System.out.println("m3 over");
    }
}
