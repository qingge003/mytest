package Z11线程死锁;
/**
 * @author chenweidong
 * @date 2022/7/24 13:33
 * TODO:死锁 示例
 */

/**
 * 死锁程序:
 * 代码不会报异常,也不会往下执行,会一直停在那
 */
public class DeadLock {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        Thread t1 = new MyThread1(o1,o2);
        Thread t2 = new MyThread1(o1,o2);

        t1.start();
        t2.start();


    }
}

class MyThread1 extends Thread{
    Object o1;
    Object o2;

    public MyThread1(Object o1,Object o2){
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2){

            }
        }

    }
}
class MyThread2 extends Thread{
    Object o1;
    Object o2;

    public MyThread2(Object o1,Object o2){
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1){

            }
        }

    }
}