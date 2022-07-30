package Thread;
/**
 * @author chenweidong
 * @date 2022/7/23 20:26
 * TODO:线程
 */

/** 线程常用方法:
 * getName() 获取线程名字
 * setName() 修改线程名字
 * currentThread() 获取当前线程对象
 */
public class ThreadTest03 {
    public static void main(String[] args) {

        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());

        MyThread2 t = new MyThread2();
        String tName = t.getName();
        System.out.println(tName);

        MyThread2 t2 = new MyThread2();
        t2.setName("线程2");
        String tName2 = t2.getName();
        System.out.println(tName2);

        t.start();
        t2.start();



    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getName() +"-->"+ i);

        }
    }
}
