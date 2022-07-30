package Thread2;
//创建消费者进程类
class Consumer extends Thread {
	private Shares Shares;
	private int number;
	public Consumer(Shares c, int number) {
		Shares = c;
		this.number = number;
	}
	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) {
			value = Shares.get();
			System.out.println("消费者消费产品数量:"+ i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}
