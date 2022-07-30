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
 * 利用循环连续读取文件
 */
public class FileInputStreamTest02 {
    public static void main(String[] args){
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("E:\\JavaSE\\temp");

            //利用循环读文件
//            while(true){
//                int readData = fis.read();
//                if (readData == -1) {
//                    break;
//                }
//                System.out.println(readData);
//            }

            int readData = 0;
            while ((readData = fis.read()) != -1){
                char s =(char)readData;
                System.out.println(s);
            }

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
