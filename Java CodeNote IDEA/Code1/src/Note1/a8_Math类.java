package Note1;
import java.math.*;
import java.math.BigInteger;
import java.util.Random;
import java.text.*;
public class a8_Math类 {
		/**
		 *数字格式化
		 */
//		// 使用实例化对象时设置格式化模式
//		static public void SingleFormat(String pattern, double value) {
//			// 实例化DecimalFormat对象
//			DecimalFormat myFormat = new DecimalFormat(pattern);
//			String output = myFormat.format(value); // 将数字进行格式化
//			System.out.println(value + " " + pattern + " " + output);
//		}
//
//		// 使用applyPattern()方法对数字进行格式化
//		static public void UseApplyPatternMethodFormat(String pattern, double value) {
//			DecimalFormat myFormat=new DecimalFormat();//实例化DecimalFormat对象
//			myFormat.applyPattern(pattern); // 调用applyPatten()方法设置格式化模板
//			System.out.println(value + " " + pattern + " " + myFormat.format(value));
//		}
//
//		public static void main(String[] args) {
//			SingleFormat("###,###.###", 123456.789);// 调用静态SingleFormat()方法
//			SingleFormat("00000000.###kg", 123456.789); // 在数字后加上单位
//			// 按照格式模板格式化数字，不存在的位以0显示
//			SingleFormat("000000.000", 123.78);
//			// 调用静态UseApplyPatternMethodFormat()方法
//			UseApplyPatternMethodFormat("#.###%", 0.789); // 将数字转换为百分数形式
//			// 将小数点后格式化为两位
//			UseApplyPatternMethodFormat("###.##", 123456.789);
//			// 将数字转化为千分数形式
//			UseApplyPatternMethodFormat("0.00\u2030", 0.789);
//		}
	/**
	 * Math数学函数
	 */
//	public static void main(String[] args) {
//		//Math类包含着很多数学函数
//		System.out.println(Math.PI);//两个数学常量
//		System.out.println(Math.E);
//
//		//指数函数方法
//		System.out.println(Math.exp(2));//获取e的2次方
//		System.out.println(Math.log(2));//取自然对数
//		System.out.println(Math.log10(2));//去底数为10的对数
//		System.out.println(Math.sqrt(4));//取平方根
//		System.out.println(Math.cbrt(8));//取立方根
//		System.out.println(Math.pow(2, 3));//计算2的三次方
//		//取整函数方法
//		System.out.println(Math.ceil(1.22));//返回大于等于参数的最小整数
//		System.out.println(Math.floor(1.22));//返回小于等于参数的最大整数
//		System.out.println(Math.rint(1.22));//返回与参数最接近的整数
//		System.out.println(Math.round(10.478));//四舍五入
//
//		//取最大值,最小值,绝对函数方法
//		System.out.println(Math.max(2,5));//取最大值
//		System.out.println(Math.min(2,5));//取最小值
//		System.out.println(Math.abs(-12));//取绝对值
//
//		System.out.println(Math.random());//产生0~1之间的double型
	/**
	 * 生成随机字符
	 */
//	public static char GetRandomChar(char cha1, char cha2) {
//		return (char) (cha1 + Math.random() * (cha2 - cha1 + 1));
//	}
//
//	public static void main(String[] args) {
//		// 获取a~z之间的随机字符
//		System.out.println("任意小写字符" + GetRandomChar('a', 'z'));
//		// 获取A~Z之间的随机字符
//		System.out.println("任意大写字符" + GetRandomChar('A', 'Z'));
//		// 获取0~9之间的随机字符
//		System.out.println("0到9任意数字字符" + GetRandomChar('0', '9'));
//	}
	/**
	 * Random类
	 */
//	public static void main(String[] args) {
//		Random r = new Random(); // 实例化一个Random类
//		// 随机产生一个整数
//		System.out.println("随机产生一个整数:" + r.nextInt());
//		// 随机产生一个大于等于0小于10的整数
//		System.out.println("随机产生一个大于等于0小于10的整数：" + r.nextInt(10));
//		// 随机产生一个布尔型的值
//		System.out.println("随机产生一个布尔型的值：" + r.nextBoolean());
//		// 随机产生一个双精度型的值
//		System.out.println("随机产生一个双精度型的值：" + r.nextDouble());
//		// 随机产生一个浮点型的值
//		System.out.println("随机产生一个浮点型的值：" + r.nextFloat());
//		// 随机产生一个概率密度为高斯分布的双精度值
//		System.out.println("随机产生一个概率密度为高斯分布的双精度值："
//				+ r.nextGaussian());
//	}

	/**
	 * 大数字运算:
	 * BigInteger类针对大整数的处理,相对于Integer范围更大,计算不会丢失精度
	 */
//	public static void main(String[] args) {
//		BigInteger bigInstance = new BigInteger("4"); // 实例化一个大数字,实例化一个对象自动调用构造函数
//		// 取该大数字加2的操作
//		System.out.println("加法操作：" + bigInstance.add(new BigInteger("2")));
//		// 取该大数字减2的操作
//		System.out.println("减法操作："
//				+ bigInstance.subtract(new BigInteger("2")));
//		// 取该大数字乘以2的操作
//		System.out.println("乘法操作："
//				+ bigInstance.multiply(new BigInteger("2")));
//		// 取该大数字除以2的操作
//		System.out.println("除法操作："
//				+ bigInstance.divide(new BigInteger("2")));
//		// 取该大数字除以3的商
//		System.out.println("取商："
//				+ bigInstance.divideAndRemainder(new BigInteger("3"))[0]);
//		// 取该大数字除以3的余数
//		System.out.println("取余数："
//				+ bigInstance.divideAndRemainder(new BigInteger("3"))[1]);
//		// 取该大数字的2次方
//		System.out.println("做2次方操作：" + bigInstance.pow(2));
//		// 取该大数字的相反数
//		System.out.println("取相反数操作：" + bigInstance.negate());
//	}



}

