package Note1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class a3_字符串 {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		/**1.判定定义为String类型的st1和st2是否相等，为什么
		 * 字符串相等应该用equals*/
		//String st1 = new String("abc");
//		String st1 = "ab";
//		String st2 = "abc";
//		String st3 = st1 +"c";
//		System.out.println(st2==st3);
//		System.out.println(st1.equals(st3));
//*****************************************************************
//		String a = "We are students";
//		System.out.println(a.length());//计算字符串长度
//		System.out.println(a.charAt(2));//获取索引为2的字母,索引从0开始
//		System.out.println(a.indexOf("a"));//查找字符索引
//		System.out.println(a.lastIndexOf("s"));//查找最后一次出现的索引
//		System.out.println(a.substring(4));//从索引开始截取
//		System.out.println(a.substring(4,6));//从索引开始,结束截取
//		System.out.println(a.trim());//去除前导和尾部空格
//		System.out.println(a.replace("W","w"));//字符串替换
//		System.out.println(a.startsWith("W"));//判断当前字符串前缀是否为指定字符
//		System.out.println(a.endsWith("d"));//判断当前字符串后缀是否为指定字符
//		System.out.println(a.toLowerCase());//转换小写
//		System.out.println(a.toUpperCase());//转换大写
//*****************************************************************
		/**
		 *日期和时间格式化
		 */
		Date date = new Date(); // 创建Date对象date 获取系统当前日期
		String year = String.format("%tY", date); // 将date进行格式化
		String month = String.format("%tm", date);
		String day = String.format("%td", date);
		String all = String.format("%tc",date);
		System.out.println(all);
		System.out.println("今年是：" + year + "年"); // 输出信息
		System.out.println("现在是：" + month + "月");
		System.out.println("今天是：" + day + "号");

		Date date2 = new Date(); // 创建Date对象date2 获取系统当前时间
		String hour = String.format("%tH", date2); // 将date进行格式化
		String minute = String.format("%tM", date2);
		String second = String.format("%tS", date2);
		System.out.println("现在是：" + hour + "时" + minute + "分"
				+ second + "秒");
		//常用格式
		String a1 = String.format("%tF",date2);
		String a2 = String.format("%tT",date2);
		System.out.println(a1+" "+a2);


		/**
		 *日期字符串转换成Date类型
		 */
//		String time ="2008-08-08 08:08:08 888";
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
//		Date datetime = sdf.parse(time);
//		System.out.println(datetime);

		/**
		 *常规类型格式化
		 */
//		String str = String.format("%d", 400 / 2); // 将结果以十进制显示
//		String str2 = String.format("%b", 3 > 5); // 将结果以布尔形式显示
//		String str3 = String.format("%x", 200); // 将结果以十进制格式显示
//		System.out.println("400的一半是：" + str); // 输出格式化字符串
//		System.out.println("3>5正确吗：" + str2);
//		System.out.println("200的十六进制数是：" + str3);

		/**
		 *正则表达式
		 */
		// 定义要匹配E_mail地址的正则表达式 邮箱名@服务器名称.后缀
//		String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
//		String str1 = "aaa@"; // 定义要进行验证的字符串
//		String str2 = "aaaaa";
//		String str3 = "1111@111ffyu.dfg.com";
//		if (str1.matches(regex)) { // 判断字符串变量是否与正则表达式匹配
//			System.out.println(str1 + "是一个合法的E-mail地址格式");
//		}
//		if (str2.matches(regex)) {
//			System.out.println(str2 + "是一个合法的E-mail地址格式");
//		}
//		if (str3.matches(regex)) {
//			System.out.println(str3 + "是一个合法的E-mail地址格式");
//		}






		/**
		 * 利用String类的构造方法创建对象
		 */
//		char a[] = {'g','o','o','d',};
//		String s = new String(a);
//		String s2 = new String("good");
//		System.out.println(s);
//		System.out.println(s2);
//
//		char b[] = {'s','t','u','d','e','n','t'};
//		String s3 = new String(b,2,4);
//		String s4 = new String("uden");
//		System.out.println(s3);
//		System.out.println(s4);


	}

}
