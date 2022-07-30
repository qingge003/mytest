package Z12注解;
/**
 * @author chenweidong
 * @date 2022/7/27 17:11
 * TODO:
 */

/**
 *
 */
public class AnnotationTest05 {
    @MyAnnotation3(value = "he")
    public void doSome(){}

    //当注解属性名为 value并且只有一个属性时,属性名可以省略
    @MyAnnotation3("he")
    public void doOther(){}
}
