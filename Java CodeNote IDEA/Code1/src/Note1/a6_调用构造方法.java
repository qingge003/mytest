package Note1;

/** 
* @author weidong
* @date 2021年8月25日 下午4:29:55
* TODO:
*/
public class a6_调用构造方法 {

	public static void main(String[] args) {
		test1 test11 = new test1(3,"lihua");//给属性赋值

		System.out.println(test11.age+";"+test11.name);
	}
}
//单独类
class test1 {
	int age;
	String name;
	
	public test1(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
}


