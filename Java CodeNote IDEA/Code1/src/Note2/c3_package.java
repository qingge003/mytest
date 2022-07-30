package Note2;
import Class.*;//访问其他包下的类
import static java.lang.Math.max;//导入静态成员方法
/** TODO:
 * 包名规范格式:公司域名倒序
 *
 * */
public class c3_package  {
    public static void main(String[] args) {
        cat cat1 = new cat();//访问其他包下的类
        System.out.println(cat1.age);

        System.out.println(max(1,4));


    }




}
