package IO;
/**
 * @author chenweidong
 * @date 2022/7/22 22:59
 * TODO:掌握File类的常用方法
 */

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File:
 *
 */
public class FileTest02 {
    public static void main(String[] args) throws Exception {

        File f1 = new File("C:\\Users\\weidong\\Desktop\\Java CodeNote IDEA\\copy.txt");
        //获取文件名
        System.out.println("文件名:" + f1.getName());
        //判断是否是一个目录
        System.out.println(f1.isDirectory());
        //判断是否是一个文件
        System.out.println(f1.isFile());
        //获取文件最后一次修改时间
        long haoMiao = f1.lastModified();//返回一个自1970年到现在的毫秒数
        Date time = new Date(haoMiao);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);
        System.out.println("最后修改时间:" + strTime);
        //获取文件大小 1MB=1024KB=1024*1024字节
        System.out.println(f1.length());

    }
}
