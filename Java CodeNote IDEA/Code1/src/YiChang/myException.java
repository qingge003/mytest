package YiChang;

/**
 * 编写自己的异常类:
 * 两步:
 * 1 编写一个类继承Exception或者RuntimeException
 * 2 提供两个构造方法,一个无参,一个带有String参数
 *
 */
//继承Exception类或Exception的某个子类,用throw来抛出某个异常
public class myException extends Exception {
	public myException(){

	}
	public myException(String exp){
		//调用Exception的构造方法,即将错误信息存入
		super(exp);//父类构造方法
	}
}
class Test{
	public static void main(String[] args) {
		myException e = new myException("用户名不能为空");
		e.printStackTrace();
	}

}
