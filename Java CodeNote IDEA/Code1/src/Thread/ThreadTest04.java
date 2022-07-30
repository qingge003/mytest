package Thread;
/**
 * @author chenweidong
 * @date 2022/7/23 22:32
 * TODO:
 */

/**
 * 关于线程sleep() 方法:
 * 1.静态方法
 * 2.参数是毫秒
 * 3.作用:让当前线程进入休眠,进入"阻塞状态",放弃占有CPU时间片,让给其他线程使用
 * 4.Thread.sleep()方法可以做到以特定时间间隔去执行某些代码
 */
public class ThreadTest04 {
    public static void main(String[] args) {
//        try {
//            Thread.sleep(1000*5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("hello");

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+ i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
