package YiChang;

/**异常对象有两个常用方法:
 * 1 获取异常简单的描述信息:
 *   String msg = exception.getMessage();
 * 2 打印异常追踪的堆栈信息:
 *   exception.printStackTrace();
 *
 *
 */
public class ExceptionTest03 {
    public static void main(String[] args) {
        NullPointerException e  = new NullPointerException("空指针异常");
//        String msg = e.getMessage();
//        System.out.println(msg);
        e.printStackTrace();
        System.out.println("hello world");
    }
}
