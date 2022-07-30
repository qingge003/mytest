package Thread3;
/**5个销售点同时出售50张票   */
public class Main {
	public static void main(String[] args) {
		Ticket a = new Ticket();
		for(int i=1; i<5; i++){
			Thread t = new Thread(a,i+"号售票点");
			t.start();
//		Thread t1 = new Thread(a);
//		t1.setName("1号售票点");//设置线程名
//		t1.start();//启动线程
//		Thread t2 = new Thread(a);
//		t2.setName("2号售票点");
//		t2.start();
//		Thread t3 = new Thread(a);
//		t3.setName("3号售票点");
//		t3.start();
//		Thread t4 = new Thread(a);
//		t4.setName("4号售票点");
//		t4.start();
//		Thread t5 = new Thread(a);
//		t5.setName("5号售票点");
//		t5.start();
		}
	}

}
