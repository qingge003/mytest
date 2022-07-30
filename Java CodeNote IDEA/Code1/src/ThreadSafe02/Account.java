package ThreadSafe02;
/**
 * @author chenweidong
 * @date 2022/7/24 11:36
 * TODO:银行账户
 */

/**
 *
 */
public class Account {
    //账号
    private  String actno;
    //余额
    private double balance;

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "actno='" + actno + '\'' +
                ", balance=" + balance +
                '}';
    }
    //取款方法
    public void withdraw(double money) {
        //以下代码必须是线程排队的,不能并发
        //一个线程全部执行完毕后,另一个线程才能进来执行
        /*
        线程同步机制:
        synchronized (){
        }
        synchronized后面的小括号中传的数据必须是多线程共享的数据,才能达到多线程同步
        假设t1、t2、t3、t4、t5，有五个线程
        只希望t1、t2、t3排队,t4、t5不需要排队
        则需要在括号中写一个t1、t2、t3共享的对象,而这个对象t4、t5不共享

        */
        //取款前余额
        synchronized (this){
            double before = this.getBalance();
            //取款后余额
            double after = before - money;

            try {
                Thread.sleep(1000*2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //更新余额
            this.setBalance(after);
        }
    }

}
