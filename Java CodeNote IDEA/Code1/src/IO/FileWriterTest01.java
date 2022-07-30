package IO;
/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileReader 字符输出流
 */
public class FileWriterTest01 {
    public static void main(String[] args){
        FileWriter out = null;
        try {
            out  = new FileWriter("file",true);

            char [] chars = {'我','是','中','国','人'};
            out.write(chars);
            out.write(chars,0,2);


            out.flush();//刷新
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            //在finally中确保流一定关闭
            if (out != null) {//避免空指针异常,关闭流的前提是流不是空
                try {
                    out.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }


    }
}
