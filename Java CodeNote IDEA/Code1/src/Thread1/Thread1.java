package Thread1;
/**继承Thread类,重写run()方法,
 * 在使用子类对象调用start()方法启动线程,将执行权交给run()方法
 * Thread.currentThread():Thread类的静态方法,总是返回当前正在执行的线程对象的引用
 * getName():该方法是Thread类的实例方法,该方法返回调用该方法的线程的名字*/
//创建线程方法1
public class Thread1 extends Thread {
	public void run() {//重写run()方法,编写代码
		System.out.println(this.getName());	
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread1 thread1 = new Thread1();//创建线程对象1
		Thread1 thread2 = new Thread1();//创建线程对象2
		thread1.start();//启动线程
		thread2.start();//启动线程
	}
}
