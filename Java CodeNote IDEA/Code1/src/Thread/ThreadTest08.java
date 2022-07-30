package Thread;
/**
 * @author chenweidong
 * @date 2022/7/23 23:02
 * TODO:强行终止一个线程的执行
 */

/**
 * 建议使用这种方式终止
 */
public class ThreadTest08 {
    public static void main(String[] args) {
        MyRunnable4 r = new MyRunnable4();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();

        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        r.run = false;

    }
}
class MyRunnable4 implements Runnable{

    boolean run = true;

    @Override
    public void run() {
            for (int i = 0; i < 10; i++) {
                if (run) {
                System.out.println(Thread.currentThread().getName() + "-->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
                else{
                    return;
                }
        }

    }
}
