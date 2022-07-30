package YiChang;

/**
 * java面试题:结果为100
 * 1 return语句一旦执行,方法必结束
 * 2 方法体中的代码必须遵循自上而下的顺序
 */
public class  finally面试题 {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result);
    }

    private static int m() {
        int i = 100;
        try{
            return i;
        }
        finally {
            i++;
        }
    }
    /*反编译后的代码
    private static int m() {
        int i = 100;
        int j = i;
        i++;
        return j;
    }*/


}
