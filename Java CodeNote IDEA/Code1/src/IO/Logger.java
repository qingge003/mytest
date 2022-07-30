package IO;
/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 记录日志的一个类
 */
public class Logger {
    public static void log(String msg) {
        PrintStream out  = null;
        try {
            out = new PrintStream(new FileOutputStream("log.txt",true));
            System.setOut(out);
            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime = sdf.format(nowTime);
            System.out.println(strTime + ":" + msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
