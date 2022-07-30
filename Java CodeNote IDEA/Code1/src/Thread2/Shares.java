package Thread2;
//创建共享资源类
class Shares {
	private int seq;
	private boolean a = false;
	public synchronized int get() {
		while (a == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		a = false;
		notify();
		return seq;
		}
	public synchronized void put(int value) {
		// TODO Auto-generated method stub
		while (a == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
			seq = value;
			a = true;
			notify();	
		}
	}
