package Note1;

/**接口形式:  [修饰符列表] interface 接口名
 * 接口中只有常量和抽象方法,所有元素都是公开的,所有的变量都是常量 int num = 1;
 * 一个类可以同时实现多个接口,可以使用多态    代码:class 类名 implements 接口1,接口2......接口n
 *
 */
public class a9_接口类 {
}
//	下面包含三个类文件:
//*******************************************************************************
//	1.接口类
//	interface my_interface {
//		public static final String name = "java";
//		abstract void talk();//接口类中都是抽象方法,这里定义一个抽象talk()方法
//	}
//************************************************************************
//    2.通过类ClassA实现这个接口
//	public class ClassA implements my_interface {
//		@Override
//		public void talk() {
//			System.out.println("接口类的抽象方法实现");
//		}
//************************************************************************	
//    3.Main中调用类ClassA
//	public class Main {
//		public static void main(String[] args) {
//				ClassA classA = new ClassA();
//				classA.talk();
//		}
//	}
//************************************************************************	
   /**继承是单继承,接口是多继承   一个接口可以同时继承多个接口 */
//	interface A {
//		void talk1();
//	}
//
//	interface B {
//		void talk2();
//	}
//
//	//C接口同时继承A,B接口,同时也继承了方法
//	interface C extends A,B {
//		void talk3();
//	}
//

/**
 * 继承和实现都存在: extends在前, implements在后
 *
 */
class Test04{
    public static void main(String[] args) {
        Flyable f = new Cat();
        f.fly();

        Flyable f2 = new Pig();
        f2.fly();
    }
}
//动物类
class  Animal{

}
//可飞翔的接口
interface Flyable{
    void fly();
}

class Cat extends Animal implements Flyable{
    public void fly(){
        System.out.println("肥猫飞翔");
    }
}
class Pig extends Animal implements Flyable{
    public void fly(){
        System.out.println("小猪飞翔");
    }

}
//没有实现飞翔接口,所以不能飞翔
class Snake extends Animal{

}