package IO;
/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader 字符输入流
 */
public class FileReaderTest01 {
    public static void main(String[] args){
        FileReader reader = null;
        try {
            reader = new FileReader("Code1/src/tempfile3.txt");
            char[] chars = new char[16];

            reader.read(chars);
            for (char c:chars) {
                System.out.print(c);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            //在finally中确保流一定关闭
            if (reader != null) {//避免空指针异常,关闭流的前提是流不是空
                try {
                    reader.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }


    }
}
