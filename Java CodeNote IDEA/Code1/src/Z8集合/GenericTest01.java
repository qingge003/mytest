package Z8集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 泛型:
 *
 */
public class GenericTest01 {
    public static void main(String[] args) {

//        //未使用泛型时
//        List myList = new ArrayList();
//        //准备对象
//        Cat cat = new Cat();
//        Bird bird = new Bird();
//        //往集合中添加对象
//        myList.add(cat);
//        myList.add(bird);
//
//        Iterator it = myList.iterator();
//        while (it.hasNext()){
//            Object obj = it.next();
//            if(obj instanceof Animal){
//                Animal a = (Animal)obj;
//                a.move();
//            }
//        }

        //使用泛型之后************************************************************************
        //使用泛型List<Animal>之后,表示list集合中只允许存储Animal类型的数据
        List<Animal> myList = new ArrayList<Animal>();

        Cat cat = new Cat();
        Bird bird = new Bird();

        myList.add(cat);
        myList.add(bird);

        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()){
            Animal a = it.next();
            a.move();
        }



    }
}
class Animal{
    public void move(){
        System.out.println("动物在移动");
    }

}
class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
class Bird extends Animal{
    public void fly(){
        System.out.println("鸟儿在飞翔");
    }
}
