package Note2;
public class b2_Break标签 {
	public static void main(String[] args) {

		/**
		 * break标签: 跳出标签范围所有循环
		 */
//		Loop: for (int i = 0; i < 3; i++) {// 在for循环前用标签标记
//			for (int j = 0; j < 6; j++) {
//				if (j == 4) {// 如果j等于4的时候就结束外层循环
//					break Loop;// 跳出Loop标签标记的循环体
//				}
//				System.out.println("i=" + i + " j=" + j);
//			}
//		}

		/**
		 * 正常break 只能跳出当前循环
		 */

	    for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 6; j++) {
			if (j == 4) {
				break;
			}
			System.out.println("i=" + i + " j=" + j);
		}
	}
	    
	    
	    
	}
}