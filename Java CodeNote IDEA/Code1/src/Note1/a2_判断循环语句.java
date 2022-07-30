package Note1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class a2_判断循环语句 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		/**计算水仙花数*/
//       int i;
//       System.out.println("100~999之间的水仙花数有：");
//       for(i=100;i<=999;i++)
//       {
//    	 int gei=i%10;
//	     int shi=i/10%10;
//	     int bai=i/100;
//	     int sum= gei*gei*gei+shi*shi*shi+bai*bai*bai;
//	     if(i==sum)
//	     {  
//	      System.out.println(i); 
//	     } 
//       }
		

//*****************************************************************
		/**使用while循环求1到5的平方和。*/
//        int i=1;
//        int sum=0;
//		while(i<=5)
//		{
//		sum = sum + i*i;
//		 i++;
//		}
//		System.out.println("1到5的平方和为："+sum);

//*****************************************************************		
/**
 * 采用for循环进行编程求解 深秋，树叶开始掉落。第一天树叶开始掉落了一半还多一片，
//   第二天又落下了剩下的一半零一片。如此往复循环，直到第十五天，树上还剩一片叶子。
//   问：这颗大树总共有多少片叶子                          */
//   int num =1;
//   int tianshu;
//   for(tianshu=14;tianshu>=1;tianshu--)
//   {
//	   num = 2*(num+1);
//   }
//   System.out.println("这颗大树总共有"+num+"片叶子");
//*****************************************************************		
     /**while循环实现 随机生成一个100以内的数，
		 猜数字游戏： 从键盘输入数，如果大了提示，大了，如果小了，提示小了，
		 如果对了，就不再猜了，并统计一共猜了多少次？           */	
//   Scanner sc = new Scanner(System.in);
//   System.out.println("****猜字游戏****");
//   Random random = new Random();
//   int suiji = random.nextInt(100);
//   System.out.println(suiji);
//   int count=0;
//   while(true)
//   {
//	System.out.println("请输入一个数：");
//	int i=sc.nextInt();
//	if(i > suiji)
//	{
//		System.out.println("猜大了！");
//		count++;
//	}
//	else if(i < suiji)
//	{
//		System.out.println("猜小了！");
//		count++;
//	}
//	else if(i == suiji)
//	{
//		count++;
//		System.out.println("恭喜你猜对了！");
//		System.out.println("你一共猜了"+count+"次");
//		break;
//	}
//	}
//*****************************************************************	   
	/**采用for循环嵌套求解 这是经典的"百马百担"问题，有一百匹马，驮一百担货，
	 * 大马驮3担，中马驮2担，两只小马驮1担，问有大，中，小马各几匹？     */
//	for(int da=100;da>0;da--)
//	{
//	 for(int zhong=100;zhong>0;zhong--) 
//     {
//	   for (int xiao=100;xiao>0;xiao--)
//	   {
//		if (da+zhong+xiao==100)
//		{
//		 if(3*da+2*zhong+xiao/2d==100)
//		 {
//System.out.println("大匹马有"+da+"匹,"+"中匹马有"+zhong+"匹,"
//		 +"小匹马有"+xiao+"匹。");
//		 }
//		}
//	   }
//	  }    	 
//	 }
//*****************************************************************		

/**	 计算三位数的个位，十位，百位上的数字之和:
     指令：输入数字，提取该数字的个位，十位，百位 
     1.提示用户输入数字 2.将该数字的个位提取出来 
     3.将该数字的十位提取出来 4.将该数字的百位提取出来 
     5.将三个数字相加 6.输出和 		
 */
//	System.out.println("请输入一个三位数的数：");
//	Scanner sc = new Scanner(System.in);
//	int shuzi = sc.nextInt();
//	int gei=shuzi%10;
//	int shi=shuzi/10%10;
//	int bai=shuzi/100;
//	int num = gei+shi+bai;
//	System.out.println(num);
//*****************************************************************	
//	System.out.println("请输入三项成绩：");
//	Scanner sc = new Scanner(System.in);
//	float a1 = sc.nextFloat();
//	float a2 = sc.nextFloat();
//	float a3 = sc.nextFloat();
//	float num = (float) (a1*0.3 + a2*0.4 + a3*0.3);
//	System.out.println("总成绩为："+num);
//*****************************************************************
//	System.out.println("请输入成绩：");
//    Scanner sc = new Scanner(System.in);
//	float score = sc.nextFloat();
//	if(score<0)
//	{
//		System.out.println("成绩小于0，请重新输入：");
//		score = sc.nextFloat();
//	}
//	if(score<0)
//	{
//	System.out.println("已安全退出");
//	System.exit(0);
//    System.out.println("确认是否退出成功，弹窗"); 
//	}
//	if(score>=0)
//	{
//		float score2 = (float) (score*0.3);
//		System.out.println("加权分数为："+score2);
//		System.exit(0);
//		
//		//Runtime.getRuntime().exit(0);
//	}
//}
//
//	System.out.println("请输入成绩：");
//    Scanner sc = new Scanner(System.in);
//    int score = sc.nextInt();
//    if(score<0 | score>100)
//    {
//    	System.out.println("数据错误");
//    	System.out.println("已安全退出");
//		System.exit(0);	
//    }
//    int a=score/10;
//    switch (a) 
//    {
//	case 6: System.out.println("及格"); break; 
//	case 7: System.out.println("中等"); break; 
//	case 8: System.out.println("良好"); break; 
//	case 9: System.out.println("优秀"); break; 
//	default:System.out.println("不合格");break; 
//	}
	
/**采用if...else语句
 * 实现由键盘输入三个整数分别存入变量num1、num2、num3， 对它们进行排序，并且从小到大输出。*/
//	System.out.println("请输入三个整数：");
//	int num1,num2,num3;
//    Scanner sc = new Scanner(System.in);
//    num1 = sc.nextInt();
//    num2 = sc.nextInt();
//    num3 = sc.nextInt();
//    int t;
//    if(num1>num2)   
//    {
//        t = num1;
//        num1 = num2;
//        num2 = t;
//    }
//    if(num1>num3)   
//    {
//        t = num1;
//        num1 = num3;
//        num3 = t;
//    }
//    if(num2>num3)
//    {
//        t = num2;
//        num2 = num3;
//        num3 = t;
//    }
//   System.out.println("数据经过排序之后从小到大为:"+num1+","+num2+","+num3);	
	/**   给定一个字符变量，判断该变量是否为元音字母并输出。
	定义一个字符变量ch并初始化 使用switch结构判断是否为元音字母，如果是元音字母则输出
	如果不是 元音字母则输出：不是元音字母 提示： 元音字母为a、e、i、o、u     */
//	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
//    System.err.println("请输入一个字母：");
//	char ch=(char) buf.read();
//	switch (ch)
//	{
//	case 'a': System.out.println(ch+"是元音字母");break;
//	case 'e': System.out.println(ch+"是元音字母");break;
//	case 'i': System.out.println(ch+"是元音字母");break;
//	case 'o': System.out.println(ch+"是元音字母");break;
//	case 'u': System.out.println(ch+"是元音字母");break;
//	default:  System.out.println(ch+"不是元音字母");break;
//	}
	
   /** 编写程序根据x的值，计算y的值，最后输出x和y的值。(使用多重if-else结构) */
//	System.out.println("请输入x的值:");
//	Scanner sc = new Scanner(System.in);
//	double x = sc.nextDouble();
//	double y;
//	if(x < 0)
//	{
//     y=-1;
//     System.out.println("x:"+x+"计算出来的值为：y="+y);
//	}
//	else if (x == 0) 
//	{
//	 y=0;
//	 System.out.println("x:"+x+"计算出来的值为：y="+y);
//	}
//	else if(x > 0)
//	{
//     y=1;
//     System.out.println("x:"+x+"计算出来的值为：y="+y);
//	}			
		
/**	for循环找出1~100中所有素数	*/
//	for(int i=2;i<=100;i++)
//	{
//		boolean issushu = true;
//		for(int j=2;j<i;j++)
//		{
//			if(i%j==0)
//			{
//				issushu = false;
//				break;
//			}
//		}
//		if(issushu)
//		{
//			System.out.println(i);
//		}
//	}
		
/**		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//   double highMath[] = {6.7,2.6,61.4,50.2,86.5,10.9,22.8,68.8,90.6,39.4,
//        		        44.3,1.88,39.5,2.3,44,18.4,15.8,91.8,55.2,56.3,
//        		        52.7,23.2,85.5,94.2,48.1,83.6,44.8,17.6,5.6,87.9};
//   double javascore[] = {68.5,93.9,74.6,99.8,53,26.5,97.6,14.5,81.3,69.8,
//        		        19.9,11.9,82.9,3.7,41.3,60.8,34.3,39.8,30.1,93.3,
//        		        75.1,66.7,87.9,29.1,37.7,26.1,58.5,18.7,4,84.1};	   
    	
		
		
		
		
		
	   
		
		
		
	}

	private static int Random(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
