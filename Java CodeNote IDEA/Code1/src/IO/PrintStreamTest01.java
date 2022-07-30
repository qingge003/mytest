package IO;
/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:标准字节输出流
 */

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

/**
 *  PrintStream :标准字节输出流,默认输出到控制台,可以选择输出到文件中
 *      1.不需要关闭流
 *
 */
public class PrintStreamTest01 {
    public static void main(String[] args) throws Exception {
        System.out.println("hello");

        PrintStream ps = System.out;
        ps.println("1");
        ps.println("1");
        ps.println("1");

        //可以改变标准输出流的输出方向
        PrintStream printStream = new PrintStream(new FileOutputStream("log"));
        System.setOut(printStream);
        System.out.println(222);

    }
}
