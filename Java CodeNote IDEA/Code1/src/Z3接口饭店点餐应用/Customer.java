package Z3接口饭店点餐应用;
/** TODO: 顾客
 * 顾客手里有一个菜单  Customer has a FoodMenu
 * 以后凡是能够使用 has a ,统一用属性的方式存在
 * 顾客类中只定义抽象属性菜单  不定义具体厨师      */
public class Customer {
    private FoodMenu foodMenu;

    public Customer() {
    }

    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }
    //点菜方法
    public void order(){
       foodMenu.shizichaojidan();
       foodMenu.yuxiangrousi();

    }

}



