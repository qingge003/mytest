package Class;

public class student extends Person {
	
	//student继承Person类
	private int age = 13;//private表示只有当前类可以调用
	final String xuehao="1919073203";//final属性不可被修改
	static long num = 3;//static定义一个静态num属性,可以不用实例化直接调用
	public void setAge(int age) {

		if(age>0 && age<200)
			this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void study() {
		System.out.println("我爱学习");
	}
	//定义一个静态方法,可以不用实例化直接调用
	public static void ss(){
		System.out.println("ss静态方法被调用");
	}
	
	
	
}
