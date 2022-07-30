package Thread2;
//创建生产进程类
class Producer extends Thread{
	private Shares Shares;
	private int number;
	
	public Producer(Shares c, int number) {
		Shares = c;
		this.number = number;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			Shares.put(i);
			System.out.println("生产者生产产品数量:"+ i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}
	}
}
