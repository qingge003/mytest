package YiChang;

/**
 * @author chenweidong
 * @date 2022/7/14 16:22
 * TODO:
 */
/**
 * 异常:
 * 1 以类的形式存在,可以new异常对象
 * 2 处理异常的两种方式:
 *   1 在方法声明时使用throws关键字,抛给上一级调用者,上一级必须处理,上一级又有两种处理异常方式
 *   2 使用try catch语句进行异常的捕捉
 * 3 异常分为编译时异常和运行时异常:编译时异常编写代码时必须处理
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        try{
            doSome();
        }
        catch (ClassNotFoundException classNotFoundException){

        }


    }
    public static void doSome() throws ClassNotFoundException {
        System.out.println("doSome!!!");
    }
}
