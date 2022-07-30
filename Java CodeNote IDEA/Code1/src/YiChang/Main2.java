package YiChang;
/**
 * 使用 throw 抛出异常 : 使用在方法体中,并且抛出一个异常对象,
 * 程序在执行到throw语句时立即停止,后面语句不执行
 * 捕捉throw抛出的异常必须使用try-catch语句
 * throw 通常用来抛出用户自定义异常
 */


public class Main2 {
	public static void main(String[] args) {
		int age = 200;
		if(age >120)
		{
			throw new ArithmeticException();//主动抛出一个算数异常
		}
		else {
			System.out.println("我的年龄是"+age);

		}
		
		
		
	}
}
