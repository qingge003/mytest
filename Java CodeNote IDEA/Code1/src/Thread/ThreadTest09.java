package Thread;
/**
 * @author chenweidong
 * @date 2022/7/24 11:03
 * TODO:线程优先级 大概率更偏向于线程优先级高的的线程
 */

/**
 * Thread.MAX_PRIORITY 最高优先级
 */
public class ThreadTest09 {
    public static void main(String[] args) {
//        System.out.println("最高优先级" + Thread.MAX_PRIORITY);
//        System.out.println("最低优先级" + Thread.MIN_PRIORITY);
//        System.out.println("默认优先级" + Thread.NORM_PRIORITY);

        Thread.currentThread().setPriority(1);

        Thread t = new Thread(new MyRunnable5());
        t.setPriority(10);
        t.setName("t");
        t.start();

        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);

        }

    }

}
class MyRunnable5 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }

    }
}

