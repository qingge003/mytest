package Z8集合;

/**
 * 自定义泛型   ssssss为随意标识符
 */
public class GenericTest03<标识符随便写> {

    public void dosome(标识符随便写 o){
        System.out.println(o);
    }

    public static void main(String[] args) {

        //规定了泛型为String类型,就只能添加String类型
        GenericTest03<String> gt = new GenericTest03<>();
        gt.dosome("abc");
        //gt.dosome(100);  出错

        //规定了泛型为Integer类型,就只能添加Integer类型
        GenericTest03<Integer> gt2 = new GenericTest03<>();
        gt2.dosome(100);
       // gt2.dosome("abc"); 出错


    }

}
