package Note1;

public class a7_包装类 {

	public static void main(String[] args) {
		// TODO 包裹类型
		/**
		 * Integer 相当于 int
		 * Long 相当于 long
		 * Short 相当于 short
		 * Byte 相当于 byte
		 * Boolean 相当于 boolean
		 * Character 相当于 char
		 * Double 相当于 double
		 * Float 相当于 float
		 */

//		int a = 0;
//		Integer aInteger = 0;
//		boolean b = false;
//		Boolean boolean1 = false;
//		char c = 'a';
//		Character character = 'a';
//		double d = 3.4;
//		Double double1 = 3.4;

		/**包裹类型可以帮助我们获得任意一个类型的最大值或最小值或长度及一些方法：*/
//		System.out.println(Byte.MIN_VALUE);//byte类型数据最小值
//		System.out.println(Byte.MAX_VALUE);
//		System.out.println(Byte.SIZE);//byte类型长度,byte为8位,一个字节
//
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.SIZE);//32位,四个字节


/** Integer */
//		String str = Integer.toString(456); // 获取数字的十进制表示
//		String str2 = Integer.toBinaryString(456); // 获取数字的二进制表示
//		String str3 = Integer.toHexString(456); // 获取数字的十六进制表示
//		String str4 = Integer.toOctalString(456); // 获取数字的八进制表示
//		System.out.println("'456'的十进制表示为：" + str);
//		System.out.println("'456'的二进制表示为：" + str2);
//		System.out.println("'456'的十六进制表示为：" + str3);
//		System.out.println("'456'的八进制表示为：" + str4);
/** Boolean */
//		Boolean b1 = new Boolean(true); // 创建Boolean对象
//		Boolean b3 = new Boolean("TRUE"); // 创建Boolean对象
//		Boolean b2 = new Boolean("ok"); // 创建Boolean对象
//		System.out.println("b1：" + b1.booleanValue());
//		System.out.println("b3：" + b3.booleanValue());
//		System.out.println("b2：" + b2.booleanValue());
/** Byte */

/** Character */
		System.out.println(Character.isDigit('8'));//判断是否为数字
		System.out.println(Character.toLowerCase('I'));//将大写I转换成小写
		System.out.println(Character.toUpperCase('i'));
		System.out.println(Character.isLowerCase('i'));//判断是否为小写
		System.out.println(Character.isUpperCase('i'));//判断是否为大写

/** Double */

/** Number */



		
		
		
	}

}
