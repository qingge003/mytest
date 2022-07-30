package YiChang;

public class Main4 {
	public static void main(String[] args) {
		try {
			throw new myException("这是我的错误信息");
		} catch (myException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}

}
