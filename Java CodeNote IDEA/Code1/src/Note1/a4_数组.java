package Note1;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 数组:
 * 3、数组当中可以存储基本数据类型的数据,也可以存储引用数据类型的数据
 * 4、数组因为是引用类型,所以数组对是堆内存当中。(数组是存储在堆当中的)
 * 5、数组当中如果存的是(java对象的话,实际上存的是对象的引用(内存地址)”,数组中不能直接存储java对象
 * 6、数组一且创建,长度不可变。(数组长度不可变)
 * 7、数组的分类:一维数组、二维数组、三维数组、多维数组,,(一维数组较多,二维数组偶尔使用!)
 * 8,所有的数组对都有 Length属性(java自带的),用来获取数组中元素的个数
 * 9、数组在内存方面存储的时候,数组中的元素内存地址(存的每一个元素部是有规则的挨着排列的)是连续的。内存地址连续
 * 这是数组存储元素的特点(特色)。数组实际上是一种简单的数据结构。
 * 11、所有的数组部是拿第一个小方框的内存地址作为个数组对象的内存地址。(数组中首元素的内存地址作为整个数组对象)
 */
public class a4_数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] a,b = new int [5];//创建两个长度为5的数组
		
//		int [] array1 = {1,2,3,4,5,6,7,8,9};
//		int [] array2 = {10,20,30,40,50,60,70,80,90};
//		System.arraycopy(array1, 0, array2, 2, 5);//将数组1下标0开始5个数复制到数组2下标2开始的5个数
//	    double rate[]= {5.00/100,5.05/100,6.00/100,6.05/100};
//	    for(int i=0;i<array1.length;i++)
//	    {
//	    System.out.print(array1[i]+",");
//	    }
//	    System.out.println();
//	    for(int j=0;j<array2.length;j++)
//	    {
//	    System.out.print(array2[j]+",");
//	    }
//	    System.out.println();
//	    for(int k=0;k<rate.length;k++)
//	    {
//	    System.out.print(rate[k]+",");
//	    }
/**
 *  数组拷贝
 */
// 	int [] src = {1,11,22,3,4};
// 	int [] dest = new int[5];
//	System.arraycopy(src,0,dest,0,5);//形参:源数组,开始下标,目标数组,开始下标,长度
//	for(int i=0;i<dest.length;i++)
//	{
//		System.out.print(dest[i]);
//	}
/**
 *	二维数组初始化
 */
//		int [] [] erwei = {{1,2,3},{11,22,33},{0}};
//		int [] [] array = new int[4][4];
//		System.out.println(erwei[1][1]);
//		//遍历二维数组
//		for (int i = 0; i <erwei.length ; i++) {
//			for (int j = 0; j < erwei[i].length ; j++) {
//				System.out.print(erwei[i][j]+" ");
//			}
//		}
/**
 *    数组排序
 *    1.使用静态方法: Arrays.sort(目标数组);
 */
//		int[] array = {1,3,22,3,55,12,134,6};
//		Arrays.sort(array);
//		for (int i = 0; i <array.length ; i++) {
//			System.out.println(array[i]);
//		}
/**
 *  2.冒泡排序
 */
//		int[]    array = {9,8,10,7,6,0,11};
//		for (int i = 6; i > 0 ; i--) {
//			for (int j = 0; j < i ; j++) {
//				if (array[j] > array[j+1]) {
//					int temp;
//					temp = array[j];
//					array[j] = array[j+1];
//					array[j+1] = temp;
//				}
//			}
//		}
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i]+"," );
//		}
/**
 *  3.选择排序：每一次从这堆参与比较的数据当中找出最小值，拿这个最小值和最前面的元素交换位置。
 *  7个数据，循环6次
 *
 */
//		int []arr = {9,8,10,7,6,0,11};
//		for (int i = 0; i <arr.length-1 ; i++) {
//			int min = i;//假设第一个是最小的
//			for (int j = i+1; j <arr.length ; j++) {
//				if (arr[j] < arr[min]) {
//					min = j;
//				}
//			}
//			if(min != i)
//			{
//				int temp;
//				temp = arr[min];
//				arr[min] = arr[i];
//				arr[i] = temp;
//			}
//		}
//		for(int i = 0;i < arr.length;i++)
//		{
//			System.out.print(arr[i]+",");
//		}





	}
}






