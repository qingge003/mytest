package Thread3;

class Ticket implements Runnable {
	private int tickets = 0;//门票计数器

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean flag = true;//是否还有票可卖
		while (flag) {
			flag = sell();//卖票
		}
	}
	
	public synchronized boolean sell() {
		boolean flag = true;
		//票数
		if (tickets < 500) {
			tickets = tickets + 1;
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
	System.out.println(Thread.currentThread().getName()+":卖出第"+tickets+"张票");
			}
		else {
			flag = false;
		}
		return flag;
	}
	}
	


