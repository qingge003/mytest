/**静态代码块:
 * 1.静态代码在类加载时执行,只执行一次,用来执行类的初始化动作
 * 2.自上而下执行
 * 3.在main方法前执行 
 * 4.一个类中可以编写多个静态代码块   */


package Note2;

public class b9_static代码块 {
	static int a  = 12;
	static {
		System.out.println(a);
		System.out.println("static1");
		System.out.println("static2");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("main");
	}

}
