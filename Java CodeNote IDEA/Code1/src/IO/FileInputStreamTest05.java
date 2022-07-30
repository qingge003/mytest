package IO;
/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:FileInputStream常用方法:
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream常用方法:
 *    int available() : 返回流当中剩余的没有读到的字节数量
 *    long skip(long n) : 跳过几个字节不读
 *
 */
public class FileInputStreamTest05 {
    public static void main(String[] args){
        FileInputStream fis = null;

        try {
            //默认路径为工程根目录
            fis = new FileInputStream("Code1/src/tempfile2");
            System.out.println("总字节数量:"+ fis.available());
            byte[] bytes = new byte[fis.available()];//这种查询剩余字节读字节方式不试用大文件
            int readCount = fis.read(bytes);
            System.out.println(new String(bytes));

            fis.skip(2);



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
