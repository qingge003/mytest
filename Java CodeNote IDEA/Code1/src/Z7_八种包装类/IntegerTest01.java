package Z7_八种包装类;
/*
8种基本数据类型对应的包装类型名是什么?
基本数据类型         包装类型
---------------------------------
    byte        java.lang.Byte
    short       java.lang.Short
    int         java.lang.Integer
    long        java.lang.Long
    float       java.lang.Float
    double      java.lang.Double
    boolean     java.lang.BooLean
    char        java.lang.Character

 */

public class IntegerTest01 {
    public static void main(String[] args) {
//        //基本数据类型  (转换为) 引用数据类型  称为装箱
//        Integer i = new Integer(123);
//        //引用数据类型  (转换为) 基本数据类型   称为拆箱
//        float f = i.floatValue();
//        System.out.println(f);
//
//        int retValue = i.intValue();
//        System.out.println(retValue);
//
//
//        //将非对应类型转换为对应类型
//        int i2 = Integer.parseInt("123");
//        System.out.println(i2);
//        //int i1 = Integer.parseInt("中国");//运行出现异常   NumberFormatException
//        double d1 = Double.parseDouble("123");
//        System.out.println(d1);



        //String --> int
        String s1 = "123";
        int i1 = Integer.parseInt(s1);
        //int --> String
        int i2 = 12;
        String s2 = String.valueOf(i2);
        //int --> Integer
        Integer x = 1000;
        //Integer --> int
        int i3 = x;

















    }





}
