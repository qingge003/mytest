package ThreadSafe;
/**
 * @author chenweidong
 * @date 2022/7/24 11:43
 * TODO:取款线程
 */

/**
 *
 */
public class AccountThread extends Thread {
    //两个线程必须共享同一个账户对象
    private Account act;

    public AccountThread(Account act){
        this.act = act;
    }

    @Override
    public void run() {
        //run方法执行表示取款操作
        double money = 5000;
        act.withdraw(5000);
        System.out.println(Thread.currentThread().getName()+"对账户"+act.getActno()+"取款成功,余额:"+act.getBalance());

    }
}
