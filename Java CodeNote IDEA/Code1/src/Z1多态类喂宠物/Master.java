package Z1多态类喂宠物;
/** 
 * 多态:父类型的引用指向子类型的对象(Dog已继承Animal) Animal animal = new Dog();
 *
 *  向上转型:子---------->父      代码:父类 父 = new 子类();
 *  即子类转型为父类,将子类对象赋值给父类类型的变量.
 *  例如 Animal animal = new Dog();或者 Pet pet = new Cat();
 *  
 *  向下转型:父---------->子     代码:子类 子 = (子类)父;
 *  父类需要访问子类中特有的方法,才向下转型,但父类转换为子类存在安全隐患
 *  需要使用instanceof对父类对象进行判断,如果对象是,则进行强制类型转换
 *  
 *  1.instanceof可以在运行时判断引用指向的对象类型
 *  2.instanceof的返回值是布尔值
 *  
 *      如果父类Animal和子类Cat存在继承关系,则Animal可向Cat转型:
 *       
 *      if(Animal instanceof Cat){
 *      Cat NewAnimal = (Cat)Animal;
 *      }
 *      
 *     */
public class Master {
	//主人可以给宠物喂东西
	
//	public void feed(Cat c) {
//		c.eat();
//	}
//
//	public void feed(Dog d) {
//		d.eat();
//	}
/** 以上代码缺点:只要添加宠物,就需要增加Master方法  
 * 
 *  向上转型:即子类转型为父类,将子类对象赋值给父类类型的变量.
 *      Pet pet = new Dog();或者 Pet pet = new Cat(); 
 *  改进后代码:方法不在面向具体猫狗Cat,Dog,而是面向宠物Pet
 *  面向抽象编程耦合度低,可以提高程序的扩展力 */


    /**以下为改进后*/
    public void feed(Pet pet) {
    	pet.eat();
	}




}
