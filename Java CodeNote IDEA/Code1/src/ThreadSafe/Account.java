package ThreadSafe;
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
        //取款前余额
        double before = this.getBalance();
        //取款后余额
        double after = before - money;

        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //更新余额
        this.setBalance(after);
    }

}
