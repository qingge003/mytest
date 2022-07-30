package Class;

/**
 * teacher类继承Person2类：
 * 一个类只能有一个直接父类
 * 父类的非私有方法及属性被子类自动继承
 * 构造方法不能被继承,但可以用super来调用父类的构造方法,构造方法可以重载
 * this 当前类的
 * super 所继承的父类的 */
public class teacher extends Person2 {
	int age = 57;
	public void show_age() {
		System.out.println(super.age);//访问父类中的age
	}
	
	@Override   //加@Override表示下面是一个重写而不是重载
	public void sayhello() {
		System.out.println("你好");
	}
	
	public void sayhello2() {
		super.sayhello();
	}

	@Override
	public void person(String n, int a) {
		// TODO Auto-generated method stub
		super.person(n, a);
	}

}
