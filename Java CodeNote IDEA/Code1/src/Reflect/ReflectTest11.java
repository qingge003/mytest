package Reflect;
/**
 * @author chenweidong
 * @date 2022/7/27 16:18
 * TODO:反射机制获取父类,父接口
 */

/**
 *
 */
public class ReflectTest11 {
    public static void main(String[] args) throws Exception {
        Class stringClass = Class.forName("java.lang.String");

        Class superClass = stringClass.getSuperclass();//获取父类
        System.out.println(superClass.getName());

        Class[] interfaces = stringClass.getInterfaces();//获取父接口
        for(Class in : interfaces){
            System.out.println(in.getName());
        }
    }
}
