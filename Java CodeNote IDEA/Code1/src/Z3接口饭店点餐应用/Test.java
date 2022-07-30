package Z3接口饭店点餐应用;
/**接口在开发中的作用:
 * 面向接口编程,可以降低程序的耦合度,提高程序的扩展力,接口的使用离不开多态机制
 *  接口可以解耦合: 解开 调用者和实现者的耦合
 *  调用者面向接口调用,实现者面向接口实现
 *  在这个例子中: 顾客面向菜单点菜,厨师面向菜单做菜     */
public class Test {
    public static void main(String[] args) {
        FoodMenu cooker1 = new ChinaCooker();
        Customer customer = new Customer(cooker1);
        customer.order();


    }
}
