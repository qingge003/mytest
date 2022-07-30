package Thread;
/**
 * @author chenweidong
 * @date 2022/7/23 23:02
 * TODO:强行终止一个线程的执行
 */

/**
 * t.stop(); 已过时,不建议使用
 */
public class ThreadTest07 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable3());
        t.setName("t");
        t.start();

        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.stop();

    }
}
class MyRunnable3 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--> begin");
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"--> end");
    }
}
