package Thread;
/**
 * @author chenweidong
 * @date 2022/7/23 19:29
 * TODO:线程
 */

/** 实现线程:
 * 第二种方式:编写一个类实现java.lang.Runnable接口,将接口作为参数传到线程构造方法中
 *
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        Thread t = new Thread(new myRunnable());
        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程-->" + i);
        }
    }
}

class myRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程-->" + i);
        }

    }
}
