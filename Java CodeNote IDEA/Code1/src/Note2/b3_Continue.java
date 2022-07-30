/**
 * Continue:跳过本次循环结束前的语句,回到循环的条件测试部分,重新开始执行循环
 * TODO:输出1~20之间的奇数
 */
package Note2;
public class b3_Continue {
	public static void main(String[] args) {
		for (int i = 1; i < 20; i++) {
			if (i % 2 == 0) {// 如果i是偶数
				continue;// 跳到下一循环
			}
			System.out.println(i);// 输出i的值
		}
	}
}
