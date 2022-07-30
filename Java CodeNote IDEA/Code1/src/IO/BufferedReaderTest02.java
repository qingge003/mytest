package IO;
/**
 * @author chenweidong
 * @date 2022/7/19 22:59
 * TODO:使用InputStreamReader将字节流转换为字符流
 */

import java.io.*;

/**
 *
 */
public class BufferedReaderTest02 {
    public static void main(String[] args) throws IOException {
        FileInputStream in  = new FileInputStream("Code1/src/IO/Copy01.java");

        //InputStreamReader将字节流转换为字符流
        InputStreamReader reader = new InputStreamReader(in);
        //BufferedReader中构造方法只能传字符流
        BufferedReader br = new BufferedReader(reader);

        BufferedReader br2 =(new BufferedReader(new InputStreamReader(new FileInputStream("Code1/src/IO/Copy01.java"))));
        String s = null;
        while((s = br2.readLine()) != null){
            System.out.println(s);
        }

        br.close();
        br2.close();
    }
}
