package Thread1;
//子线程的休眠,中断
public class Thsleep {
	public static void main(String[] args) {
		System.out.println("开始执行主线程");
		SleepRunner xc1 = new SleepRunner();
		xc1.setName("休眠线程");
		xc1.start();
		System.out.println("休眠线程开始执行");
		NormalRunner xc2 = new NormalRunner();
		xc2.setName("正常运行线程");
		xc2.start();
		System.out.println("正常线程执行结束");
	}
}
//休眠线程
class SleepRunner extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1);//线程休眠10ms
		} catch (Exception e) {
			// TODO: handle exception
		}
		//在线程中执行的代码
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName()+"第"+i+"次被执行");
		}
	}

}
//正常运行线程
class NormalRunner extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//在线程中执行的代码
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName()+"第"+i+"次被执行");
		}
	}

}
















