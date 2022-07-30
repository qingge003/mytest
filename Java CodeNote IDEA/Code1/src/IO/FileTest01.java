package IO;
/**
 * @author chenweidong
 * @date 2022/7/22 22:59
 * TODO:掌握File类的常用方法
 */

import java.io.File;

/**
 * File:
 * 1.File类和四大家族没有关系,所以File类不能完成文件的读写
 * 2.File对象代表什么:
 *  文件和路径名的抽象表示形式
 *
 */
public class FileTest01 {
    public static void main(String[] args) throws Exception {

        File f1 = new File("E:\\file" );
        //判断是否存在
        System.out.println(f1.exists());
        if (!f1.exists()) {
            //不存在就以文件形式创建出来
            //f1.createNewFile();
            //以目录的形式创建出来
            f1.mkdir();
        }

        File f2 = new File("E:/a/b/c/d" );
        if (!f2.exists()) {
            //以多重目录的形式创建出来
            f2.mkdirs();
        }
        //获取文件父路径
        File f3 = new File("E:\\file");
        String parentPath = f3.getParent();
        System.out.println(parentPath);
        //获取文件绝对路径
        File parentFile = f3.getParentFile();
        System.out.println("绝对路径:" + parentFile.getAbsolutePath());
        //获取文件绝对路径
        File f4 = new File("copy");
        System.out.println(f4.getAbsolutePath());

    }
}
