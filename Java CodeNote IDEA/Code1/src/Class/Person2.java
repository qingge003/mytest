package Class;

public class Person2 {
	int age = 18;
	String name = "张三";
	
	public Person2() {
		System.out.println("父类的构造方法被调用");	
	}

	public void person(String name,int age) {
	    this.age = age;
	    this.name = name;
	}
    
    public void sayhello() {
		System.out.println("我叫"+name+",今年"+age+"岁了");
	}

}
