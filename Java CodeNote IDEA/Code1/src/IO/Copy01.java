package IO;

/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:使用FileOutputStream和 FileInputStreamTest进行文件拷贝
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用FileOutputStream和 FileInputStreamTest进行文件拷贝
 */
public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
//            fis = new FileInputStream("E:\\JavaSE\\第2章 使用Eclipse.mp4");
//            fos  =new FileOutputStream("F:\\JavaSE\\第2章 使用Eclipse.mp4");
            fis = new FileInputStream("C:\\Users\\weidong\\Desktop\\桌面相册\\苹果平板选购指南.png");
            fos  =new FileOutputStream("C:\\Users\\weidong\\Desktop\\苹果平板选购指南.png");



            //一边读一边写
            byte[] bytes = new byte[1024*1024];
            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1) {
                fos.write(bytes,0,readCount);

            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try{
                if (fos !=null){
                    fos.close();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            try{
                if (fis !=null){
                    fis.close();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        }

    }
}
