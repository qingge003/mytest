package Z12注解;
/**
 * @author chenweidong
 * @date 2022/7/27 16:37
 * TODO:@Override注解
 */

/**
 * @Override 注解只能注解方法,这个注解是给编译器参考的,
 * 凡是JAVA中的方法带有这个@Override的,编译器都会编译检查,如果这个方法不是重写父类方法,则会报错
 *
 */
public class AnnotationTest02 {
    @Override
    public String toString() {
        return super.toString();
    }
}
