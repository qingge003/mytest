package YiChang;
//TODO 异常捕捉处理

/**
 * 异常处理用以下三个函数获取异常的有关信息:
 * getMessage()函数:输出错误性质
 * toString()函数 :给出异常的类型与性质
 * printStackTrace()函数 : 指出异常的类型,性质,栈层次及出现在程序中的位置
 *
 * 退出程序:System.exit();
 */
public class Main1{
	public static void main(String[] args) {
		try {
			String s = "hellojava";
		    Integer.valueOf(s);
		    System.out.println("程序没错");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("程序出错了");
			e.printStackTrace();//输出异常性质
			//System.exit(1);
		}
		finally {
			System.out.println("这个一定会执行");


		}

		
	}

}
