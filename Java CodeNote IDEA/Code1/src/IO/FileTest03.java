package IO;
/**
 * @author chenweidong
 * @date 2022/7/22 16:07
 * TODO:掌握File类的常用方法
 */

import java.io.File;

/**
 *
 */
public class FileTest03 {
    public static void main(String[] args) {
        //File[] listFiles(FilenameFilter filter)
        //获取当前目录下所有子文件
        File f1 = new File("D:\\Edge Downloads");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());//获取文件名
        }

    }
}
