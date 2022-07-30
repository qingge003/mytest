package IO;
/**
 * @author chenweidong
 * @date 2022/7/22 16:14
 * TODO:拷贝目录
 */

import java.io.*;

/**
 * 不完善,可以实现功能,但有时会报异常
 */
public class Copy02 {
    public static void main(String[] args) {
        //拷贝源
        File srcFile = new File("D:\\薅羊毛");
        //拷贝目录
        File destFile = new File("E:\\");
        //调用拷贝方法
        copyDir(srcFile,destFile);

    }

    /**
     * 拷贝目录
     * @param srcFile 拷贝源
     * @param destFile 拷贝目标位置
     */
    private static void copyDir(File srcFile,File destFile) {
        if (srcFile.isFile()) {
            //如果是一个文件,递归结束
            //是文件则需要拷贝,一边读一边写
            FileInputStream in = null;
            FileOutputStream out = null;

            try {
                in = new FileInputStream(srcFile);
                String path = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\") + srcFile.getAbsolutePath().substring(3);
                out = new FileOutputStream(path);

                byte[] bytes = new byte[1024 * 1024];
                int readCount = 0;
                while ((readCount = in.read(bytes)) != -1) {
                    out.write(bytes, 0, readCount);
                }
                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                    if (out != null) {
                        try {
                            out.close();
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }
                    }

                }
            }
            return;
        }
        //获取源下面的子目录
        File[] files = srcFile.listFiles();
        for (File file : files) {
            if (file.isDirectory()){
                String srcDir = file.getAbsolutePath();
                String destDir = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath():destFile.getAbsolutePath()+ "\\") + srcDir.substring(3);
                File newFile = new File(destDir);
                if (!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            copyDir(file,destFile);
        }
    }
}
