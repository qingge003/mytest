package IO;
/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:IO流
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * java.io.FileInputStreamTest:
 * 1.文件字节输入流,万能的,任何类型文件都可以读
 * 2.字节的方式
 */
public class FileInputStreamTest01 {
    public static void main(String[] args){
        FileInputStream fis = null;

        try {
           fis = new FileInputStream("E:\\JavaSE\\temp");
           //第一次读
           int readData = fis.read();
           System.out.println(readData);
            //再读一次
            readData = fis.read();
            System.out.println(readData);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            //在finally中确保流一定关闭
            if (fis != null) {//避免空指针异常,关闭流的前提是流不是空
            try {
                fis.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        }


    }
}
