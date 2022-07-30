package IO;
/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:BufferedWriter流
 */

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * BufferedWriter
 */
public class BufferedWriterTest01 {
    public static void main(String[] args) throws Exception {
        BufferedWriter out = new BufferedWriter(new FileWriter("copy",true));
        out.write("hello world");
        out.write("\n");
        out.write("hello java");


        out.flush();
        out.close();
    }

}
