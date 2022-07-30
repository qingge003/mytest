package Z2内部类;
/**TODO:使用this关键字获取内部类和外部类的引用
 * 如果在外部类中定义的成员变量与内部类的成员变量名称相同,可以使用this关键字
 * 在内部类使用 this. 调用内部类成员变量, 使用 外部类.this. 调用外部类的成员变量*/
public class TheSameName {
	private int x;
	
	private class Inner {//内部类Inner
		private int x = 9;
		public void doit(int x) {
			x++; // 调用的是形参x
			this.x++; // 调用内部类的变量x
			TheSameName.this.x++; // 调用外部类的变量x
		}
	}
}
