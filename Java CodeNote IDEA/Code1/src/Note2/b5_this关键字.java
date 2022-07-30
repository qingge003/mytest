package Note2;
/**this关键字:
 * 1.this可以使用在实例方法中和构造方法中,不能使用在静态方法中
 * 2.this大部分时候可以省略,在区分局部变量和实例变量的时候不能省略 
 * 3.形式:this.   this(); 
 * 4.this()只能出现在构造方法第一行,通过当前的构造方法去调用"本类"中其他的构造方法,
 *   目的是:代码复用      */

public class b5_this关键字 {
	
		
}
/** this调用构造方法       */
//class anything {
//	public anything() {
//		this("this调用有参构造方法");//this调用类中的构造方法
//		System.out.println("无参构造方法");
//	}
//	public anything(String name) {
//		System.out.println("有参构造方法");
//	}
//}

class Student {
	private int num;
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}


