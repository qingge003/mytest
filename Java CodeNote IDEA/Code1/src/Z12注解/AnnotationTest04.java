package Z12注解;
/**
 * @author chenweidong
 * @date 2022/7/27 17:04
 * TODO:注解中有属性
 */

/**
 * 当注解中有属性时,使用注解时要给属性赋值
 */
public class AnnotationTest04 {
    @MyAnnotation2(name = "张三",color = "red")
    public static void main(String[] args) {

    }
}
