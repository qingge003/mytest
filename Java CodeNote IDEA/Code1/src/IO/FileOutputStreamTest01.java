package IO;
/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream:
 * 文件字节输出流
 */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;

        try {
            //文件不存在会自动新建
           fos = new FileOutputStream("Code1/src/tempfile3",true);

            byte[] bytes = {97,98,99,100};
            fos.write(bytes);
            fos.write(bytes,0,2);

            String s = "我是一个中国人";
            byte [] bs = s.getBytes();//将String字符串转换为byte数组
            fos.write(bs);


            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            //在finally中确保流一定关闭
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }

    }
}
