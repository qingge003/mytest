package Z12注解;
/**
 * @author chenweidong
 * @date 2022/7/27 21:44
 * TODO:Target元注解用来标注“被标注的注解”可以出现在哪些位置上。
 *      Retention元注解用来标注“被标注的注解”最终保存在哪里。
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Retention注解枚举: 反射机制RUNTIME,类CLASS,SOURCE
 */
//只允许注解可以标注类,方法
@Target(value = {ElementType.TYPE,ElementType.METHOD})
//希望这个注解可以被反射
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation4 {

}
