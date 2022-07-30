package ThreadSafe02;
/**
 * @author chenweidong
 * @date 2022/7/24 11:47
 * TODO:模拟两个线程同时对一个账户进行取款 添加线程同步机制确保安全
 */

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        Account act = new Account("act-001",10000);

        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();



    }
}
