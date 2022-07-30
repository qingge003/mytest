package Z3接口饭店点餐应用;
/** TODO: 美国厨师
 * 厨师是接口的实现者*/
public class AmericanCooker implements FoodMenu {
    @Override
    public void shizichaojidan() {
        System.out.println("美国厨师做的柿子炒鸡蛋");

    }

    @Override
    public void yuxiangrousi() {
        System.out.println("美国厨师做的鱼香肉丝");

    }
}
