package Z12注解;
/**
 * @author chenweidong
 * @date 2022/7/27 16:28
 * TODO:注解中定义属性
 */

/**
 * 1.当注解中有属性时,使用注解时要给属性赋值
 * 2.当属性使用default指定默认值时,则使用注解时不用给属性赋值
 */
public @interface MyAnnotation2 {
    /**
     *
     * @return
     */
    String name();
    String color();
    //属性指定默认值
    int age() default 25;

}

