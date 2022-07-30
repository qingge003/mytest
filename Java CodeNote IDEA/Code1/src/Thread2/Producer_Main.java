package Thread2;
/**               建立线程类
 * 编写生产者类,消费者类及共享资源类,然后利用主类来测试同步问题:
 * 生产者将产品交给共享资源区,而消费者从共享资源区将产品消费掉,
 * 生产者每生产一个产品需要花费500ms,消费者每消费一个产品也需要花费500ms
 * 生产者生产出来产品,消费者才可以消费 */
//主程序
public class Producer_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shares c = new Shares();
		Producer p = new Producer(c, 1);
		Consumer co = new Consumer(c, 1);
		p.start();
		co.start();
	}

}
