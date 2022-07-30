 package Note2;
/**super与this对照:
 * 
 * this关键字:
 * 1.this可以使用在实例方法中和构造方法中,不能使用在静态方法中
 * 2.this大部分时候可以省略,在区分局部变量和实例变量的时候不能省略 
 * 3.形式:this.   this(); 
 * 4.this()只能出现在构造方法第一行,通过当前的构造方法去调用"本类"中其他的构造方法,
 *   目的是:代码复用 
 *        
 * super关键字:
 * 1.super可以使用在实例方法中和构造方法中,不能使用在静态方法中
 * 2.super大部分时候可以省略,当子类父类有同名属性或方法,单独访问父类的需要super.
 * 3.形式:super.   super(); 
 * 4.super()只能出现在构造方法第一行,通过当前的构造方法去调用"父类"中的构造方法,
 *   目的是:创建子类对象的时候,先初始化父类型特征 
 *   
 * this()和super()不能共存 
 * super(实参)作用:初始化当前对象的父类型特征,但并不是创建对象,实际上对象只创建了一个    
 *       */
//public class c1_super关键字 {
//	public static void main(String [] args ) {
//		new B();
//	}
//}
//class A{
//	public A(){
//		System.out.println("A类无参构造方法");
//	}
//	public A(int i) {
//		System.out.println("A类有参构造方法");
//
//	}
//}
//class B extends A{
//	public B() {
//		super(12);//调用父类构造方法
//		System.out.println("B类构造方法");
//	}
//}
 
 
/**输出顺序:13654  */

public class c1_super关键字 {
	public static void main(String [] args ) {
		new C();
	}
}
class A{
	public A(){
		System.out.println("1");
	}
}
class B extends A{
	public B() {
		System.out.println("2");
	}
	public B(String name) {
		System.out.println("3");
	}
}
class C extends B{
	public C() {
		this("zhangsan");
		System.out.println("4");
	}
	public C(String name) {
		this(name,20);
		System.out.println("5");
	}
	public C(String name,int age) {
		super(name);
		System.out.println("6");
    }
}



















