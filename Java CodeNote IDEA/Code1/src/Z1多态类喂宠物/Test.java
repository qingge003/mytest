package Z1多态类喂宠物;

/**
* @author weidong
* @date 2021年8月25日 下午9:24:33
* TODO:
*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Master zhangsan = new Master();
//		Cat cat = new Cat();
//		zhangsan.feed(cat);
//
//		Dog dog = new Dog();
//		zhangsan.feed(dog);
		
		/**以下为改进后*/

		Master zhangsan = new Master();
		zhangsan.feed(new Cat());
		zhangsan.feed(new Dog());
		zhangsan.feed(new Pig());
		

	}

}
