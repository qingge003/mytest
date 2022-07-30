package YiChang;
/**
 * 使用关键字 throws抛出异常,应用在声明方法时,指定可能抛出的异常
 */


import java.util.Scanner;

public class Main3 {
	public static void myage(String a)throws NumberFormatException {
		int age = Integer.valueOf(a);
		if (age < 120) {
			System.out.println("我的年龄是"+Integer.valueOf(age));
		}
		else {
			throw new ArithmeticException();
		}
	}
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入年龄:");
			String b = sc.next();
			myage(b);
		}catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("年龄填错了");
		}catch (ArithmeticException c) {
			// TODO: handle exception
			System.out.println("年龄太大了");
		}
		
	}

}
