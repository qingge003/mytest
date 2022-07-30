package Note1;

public class a5_函数 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double a1 = Perimeter(5);
       double a2 = Perimeter(10);
       double a3 = Perimeter(15);
       double area1 = area(5);
       double area2 = area(10);
       double area3 = area(15);
       System.out.println(Math.PI);//精确π值
       System.out.println("半径为5的圆周长为："+a1+",面积为："+area1);
       System.out.println("半径为10的圆周长为："+a2+",面积为："+area2);
       System.out.println("半径为15的圆周长为："+a3+",面积为："+area3);
	}
	public static  double Perimeter(double r) {
		return 2*Math.PI*r;
	}//定义求周长函数
	public static double area(double r) {
		return 3.14*r*r;
	}//定义求面积函数
}
