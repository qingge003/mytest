package IO;
/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:BufferedReader:
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * BufferedReader:
 * 1.带有缓冲区的字符输入流
 * 2.使用这个流的时候不需要自定义char数组,或者说不需要自定义byte数组,自带缓冲
 * 3.readLine()方法一次读一行,返回null表示读完
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("Code1/src/IO/Copy01.java");
        ///当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流。
        // 外部负责包装的这个流，叫做：包装流，还有一个名字叫做：处理流。
        // 当前这个程序来说：FileReader就是一个节点流。BufferedReader就是包装流/处理流。
        // 关闭流:
        // 对于包装流来说，只需要关闭最外层流就行，里面的节点流会自动关闭。
        BufferedReader br = new BufferedReader(reader);

//        String firstLine = br.readLine();
//        System.out.println(firstLine);
//
//        firstLine = br.readLine();
//        System.out.println(firstLine);
//
//        firstLine = br.readLine();
//        System.out.println(firstLine);

        String s = null;
        while((s = br.readLine()) != null){
            System.out.println(s);
        }

        br.close();
    }
}
