package Class;
/***final修饰的类不能被继承
 * final修饰的方法不可被重写,但可被继承
 * final变量在声明时必须赋值,之后不能再更改
 * */


public final class cat {
	static final double PI = 3.14;

	public int age = 2;

	final void doit(){
		System.out.println("final方法调用");
	}
	
}
