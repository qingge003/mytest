package Note2;
import java.util.Random;

/**1.final修饰的类不能被继承
 * 2.final修饰的方法不可被覆盖,重写,但可被继承
 * 3.final变量在声明时必须赋值,之后不能再更改
 * 4.某个类设置为final,则类中所有方法隐式设置为final,但是成员变量可以定义为非final形式
 * 5.final修饰的实例变量一般添加static修饰,static final 联合修饰的变量称为常量,常量名一般全部大写
 * 6.常量和静态变量,都是存储在方法区,都是在类加载时初始化
 *
 * */

//final class FinalClass {
//	int a = 3;
//
//	public static void main(String args[]) {
//		FinalClass f = new FinalClass();
//		f.a++;
//		System.out.println(f.a);
//	}
//}

//***********************************************************************
/**
 * 例子中: a1前后变化,a2前后不变
 * 定义全局变量时,为了使变量真正做到不可改变,通常使用格式; private static final 类型 常量名 */
class FinalStaticData {
	private static Random rand = new Random(); // 实例化一个Random类对象
	// 随机产生0~10之间的随机数赋予定义为final的a1
	private final int a1 = rand.nextInt(10);
	// 随机产生0~10之间的随机数赋予定义为static final的a2
	private static final int a2 = rand.nextInt(10);

	public static void main(String[] args) {
		FinalStaticData fdata = new FinalStaticData(); // 实例化一个对象
		// 调用定义为final的a1
		System.out.println("实例化对象调用a1的值：" + fdata.a1);
		// 调用定义为static final的a2
        System.out.println("实例化对象调用a2的值：" + fdata.a2);
		// 实例化另外一个对象
		FinalStaticData fdata2 = new FinalStaticData();
        System.out.println("重新实例化对象调用a1的值：" + fdata2.a1);//重新实例化的a1和之前的a1不一样
        System.out.println("重新实例化对象调用a2的值：" + fdata2.a2);
	}
}
