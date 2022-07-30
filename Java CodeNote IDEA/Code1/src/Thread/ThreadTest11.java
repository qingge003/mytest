package Thread;
/**
 * @author chenweidong
 * @date 2022/7/24 23:01
 * TODO:生产与消费平衡 生产多少,消费多少 wait();notify();
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ThreadTest11 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Thread t1 = new Thread(new Producer(list));
        Thread t2 = new Thread(new Consumer(list));

        t1.setName("生产者线程");
        t2.setName("消费者线程");
        t1.start();
        t2.start();


    }
}

//生产线程
class Producer implements Runnable{
    private List list;
    public Producer(List list){
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                if (list.size() > 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object obj = new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName() + "-->" + obj);
                list.notifyAll();
            }
        }

    }
}
//消费线程
class Consumer implements Runnable{
    private List list;
    public Consumer(List list){
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (list){
                if (list.size() == 0){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序能执行到这说明仓库中有数据,进行消费
                Object obj = list.remove(0);
                System.out.println(Thread.currentThread().getName() + "-->" + obj);
                list.notifyAll();
            }
        }

    }
}