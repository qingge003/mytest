package Class;

public class Person {
	int age = 18;
	String name = "张三";

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public void person(String n,int a) {
	    age = a;
	    name = n;
	}

    public void SayHello() {
		System.out.println("我叫"+name+",今年"+age+"岁了");
	}


//	int age = 18;
//	String name = "张三";
//
//
//
//	public Person() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Person(int age, String name) {
//		super();
//		this.age = age;
//		this.name = name;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

}
