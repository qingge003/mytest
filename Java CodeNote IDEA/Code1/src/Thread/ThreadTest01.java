package Thread;
/**
 * @author chenweidong
 * @date 2022/7/23 19:04
 * TODO:线程
 */

/** 实现线程
 * 第一种方式:编写一个类,直接继承java.lang.Thread,重写run方法:
 * start()方法:自动调用run方法,并且run方法在分支栈的底部,同时mian方法在主栈的底部,mian方法和run方法是同级的
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        myThread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程-->" + i);
        }
    }

}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程-->" + i);
        }
    }
}
