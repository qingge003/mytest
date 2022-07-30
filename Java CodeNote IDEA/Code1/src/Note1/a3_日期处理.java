package Note1;

import java.io.PrintStream;

/**
 * @author chenweidong
 * @date 2022/7/11 17:53
 * TODO:
 */
public class a3_日期处理 {
}

/**
 * 统计一个方法执行耗费的毫秒数
 */
class DateTest01{
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();//记录开始时间
        print();
        long end = System.currentTimeMillis();//记录结束时间
        System.out.println("耗费时长"+(end - begin)+"毫秒");
    }
    public static void print(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("i = "+i);
        }
    }


}
