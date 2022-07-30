package Thread1;
/**定义实现接口Runnable类,重写接口中的抽象方法run(),
 * 然后把这个接口实现类的对象作为参数传入Thread的构造方法中,来创造一个新线程 */
//创建线程方法2
public class myRunnable implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		myRunnable r1 = new myRunnable();
		myRunnable r2 = new myRunnable();
		myRunnable r3 = new myRunnable();
		
		Thread thread1 = new Thread(r1,"MyThread1");
		Thread thread2 = new Thread(r2);
	    thread2.setName("MyThread2");
		Thread thread3 = new Thread(r3);
	    thread1.start();
	    thread2.start();
	    thread3.start();	
	}	
}
