package Thread;
/**
 * @author chenweidong
 * @date 2022/7/23 22:48
 * TODO:如何中断线程的睡眠
 */

/**
 * t.interrupt();//通过抛出异常 中断休眠
 */
public class ThreadTest06 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.setName("t");
        t.start();

        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();//通过抛出异常 中断休眠

    }
}
class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--> begin");
        try {
            Thread.sleep(1000*60*24*365);
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"--> end");
    }
}
