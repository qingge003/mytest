package Thread;
/**
 * @author chenweidong
 * @date 2022/7/24 19:10
 * TODO:实现线程的第三种方式 多了获取线程返回值功能
 */

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/** 实现线程的第三种方式:
 *  实现Callable接口
 *  优点:可以获取返回值
 *  缺点:执行效率低
 */
public class ThreadTest10 {
    public static void main(String[] args) throws Exception {
        //第一步:创建一个未来任务类对象
        //参数
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {//call方法相当于run方法,只不过有返回值
                System.out.println("call method begin");
                Thread.sleep(1000 * 5);
                System.out.println("call method end");
                int a = 100;
                int b = 200;
                return a + b;
            }
        });

        Thread t = new Thread(task);
        t.start();

        Object obj = task.get();//get()方法需要等待线程结束才能拿到返回值
        System.out.println(obj);

        System.out.println("hello");
    }
}
