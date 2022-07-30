package Note2;

/**枚举:
 * 返回结果是两种建议用布尔类型,多于两种建议用枚举类型,例如星期,月份,季节,颜色
 */
public class c6_枚举 {
}
class EnumTest01{
    public static void main(String[] args) {
        Result a = devide(1,1);
        System.out.println(a == Result.SUCCESS ? "成功":"失败");
    }

    /**
     * 计算两个int类型的商,计算成功返回1,计算失败返回0
     * @param a int类型数据
     * @param b int类型数据
     */
    public static Result devide(int a,int b){
        try{
            int c =  a / b;
            return Result.SUCCESS;
        }
        catch (Exception e)
        {
            return Result.FAIL;
        }
    }
enum Result{
        //枚举中的每一个值,可以看作是常量
        SUCCESS,FAIL
}
enum Color{
        RED,BLUE,YELLOW

}

}
