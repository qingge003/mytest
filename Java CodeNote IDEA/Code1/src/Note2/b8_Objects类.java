package Note2;
/**所有类默认继承Object类,用 ctrl+shift+T 可找到*/
public class b8_Objects类 {
}

/**  getClass().getName():取得类的名称
 *   重写toString方法  */
//public class ObjectInstance {
//	public String toString() { // 重写toString()方法
//		return "在" + getClass().getName() + "类中重写toString()方法";
//	}
//	
//	public static void main(String[] args) {
//		ObjectInstance ob = new ObjectInstance();
//		System.out.println(ob); // 打印本类对象,自动调用toString()方法
//	}
//}

/** equals()方法默认比较两个对象的引用地址
 * public boolean equals(Object obj) {
 *         return (this == obj);
 *     }
 *     */
//class V { // 自定义类V
//}
//
//public class OverWriteEquals {
//	public static void main(String[] args) {
//		String s1 = "123"; // 实例化两个对象，内容相同
//		String s2 = "123";
//		System.out.println(s1.equals(s2)); // 输出true
//		V v1 = new V(); // 实例化两个V类对象
//		V v2 = new V();
//		System.out.println(v1.equals(v2)); // 输出false
//	}
//}

/**
 *关于 Object类中的fina1ize()方法
 * 1、在 Object:类中的源代码:  protected void finalize() throws Throwable{}
 * 2.fina1ize()方法只有一个方法体,里面没有代码,而且这个方法是 protected修饰的。
 * 3、这个方法不需要程序员手动调用,JVM的垃圾回收器负责调用这个方法
 * 4.fina1ize()方法的执行时机:
 *  当一个java对象即将被垃圾回收器回收的时候,垃圾回收器负责调用fina1ize()方法。
 * 5、fina1ize()方法实际上是suN公司为java程序员准备的一个时机,垃圾销毁时机
 *  如果希望在对象销毁时机执行一段代码的话,这段代码要写到fina1ize()方法当中
 * 6.项目开发中有这样的业务需求:所有对象在JVM中被释放的时候,请记录一下释放时间!
 *   记录对象被释放的时间点,这个负责记录的代码写到finalize()中
 */
class Test01{
    public static void main(String[] args) {
        for (int i=0;i<100;i++) {
            Person person = new Person();
            person = null;
            System.gc();//建议调用垃圾回收器
        }
    }
}
class Person{
    protected void finalize() throws Throwable{
        System.out.println("即将被销毁!");
    }
}
















