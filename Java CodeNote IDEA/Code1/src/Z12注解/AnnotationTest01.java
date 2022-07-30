package Z12注解;
/**
 * @author chenweidong
 * @date 2022/7/27 16:24
 * TODO:注解
 */

import java.lang.annotation.Annotation;

/**注解:
 * 1.或者叫做注释,Annotation
 * 2.自定义注解:语法格式
 *   [修饰符列表] @interface 注解类型名{
 *
 *   }
 * 3.使用:@符号
 * 4.默认注解可以出现在任意位置
 */

@MyAnnotation
public class AnnotationTest01 {
    @MyAnnotation
    private int no;
    public AnnotationTest01(){}
    @MyAnnotation
    public static void m1(){}

    public void m2(@MyAnnotation String s){}


    public static void main(String[] args) {


    }
}
