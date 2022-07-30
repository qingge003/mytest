package IO;
/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:
 */

import javax.security.auth.login.CredentialNotFoundException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**java.io.FileInputStreamTest:
 * 一次最多读取b.length个字节
 * 减少硬盘和内存的交互,提高程序的执行效率
 */
public class FileInputStreamTest04 {
    public static void main(String[] args){
        FileInputStream fis = null;

        try {
            //默认路径为工程根目录
            fis = new FileInputStream("Code1/src/tempfile3");//tempfile2:abcdef

            byte[] bytes = new byte[4];
            //从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中,例子中一次读四个字节
//            while(true){
//                int readCount = fis.read(bytes);
//                if (readCount == -1) {
//                    break;
//                }
//                System.out.print(new String(bytes,0, readCount));
//            }

            int readCount = 0;
            //读一个byte数组,读到多少个转换多少个
            while ((readCount = fis.read(bytes)) != -1){
                System.out.print(new String(bytes,0, readCount));
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

