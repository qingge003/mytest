package Class;

import java.util.Objects;

//abstract修饰的类称为抽象类，不能被实例化
public abstract class fish {
     int age = 1;
     
     public void speak() {
		System.out.println("很高兴认识你们");
	}
     public abstract void talk();//abstract修饰的方法只需声明，不用实现,
                                  //即声明一个抽象方法,在其继承的子类中实现

}
