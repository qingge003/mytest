package Thread;
/**
 * @author chenweidong
 * @date 2022/7/23 22:41
 * TODO:面试题
 */

/**
 *
 */
public class ThreadTest05 {
    public static void main(String[] args) {
        Thread t = new MyThread3();
        t.setName("t");
        t.start();

        try {
            t.sleep(1000 * 5);//休眠方法与对象无关,执行时还是会转换为Thread.sleep()
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}

class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);

        }
    }
}