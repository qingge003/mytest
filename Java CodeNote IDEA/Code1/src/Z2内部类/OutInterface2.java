package Z2内部类;
/**TODO:局部内部类    */
interface OutInterface2 { // 定义一个接口
}
/** 在方法中定义的内部类只能访问方法中的final类型的局部变量,
 *  所以在内部类中不能修改局部变量的值   */
class OuterClass3 {
	public OutInterface2 doit(final String x) { // doit()方法参数为final类型
		// 在doit()方法中定义一个内部类
		class InnerClass2 implements OutInterface2 {
			InnerClass2(String s) {
				s = x;
				System.out.println(s);
			}
		}
		return new InnerClass2("doit");
	}
}

















