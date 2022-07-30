package Z6_String相关知识;
/*
new 对象一定是在堆内存中开辟空间

 */
class StringTest01 {
    public static void main(String[] args) {
        //String类中方法
        //1. charAt(int index)
        char c = "中国人".charAt(0);
        System.out.println(c);

        //2.int  compareTo(String anotherString)  字符串比较:将字符串第一个字母和目标字符串的第一个字母比较
        int result = "abc".compareTo("abc");
        System.out.println(result);
        int result2  = "abc".compareTo("abdc");
        System.out.println(result2);
        int result3 = "abc".compareTo("ba");
        System.out.println(result3);

        //3.boolean contains(CharSequence s)  判断前面的字符串是否包含后面的字符串
        System.out.println("Helloworld.java".contains(".java"));
        System.out.println("Helloworld.java".contains(".java2"));

        //4.boolean endsWith(String suffix) 判断当前字符串是否以某个字符串结尾
        System.out.println("test.txt".endsWith("txt"));
        System.out.println("test.txt".endsWith("txt2"));

        //5.boolean equals(Object anObject)
        System.out.println("abc".equals("abc"));

        //6.boolean equalsIgnoreCase(String anotherString)  比较两个字符串,忽略大小写
        System.out.println("abc".equalsIgnoreCase("Abc"));

        //7.byte[] getBytes() 将字符串装换成字节数组
        byte [] bytes = "abcd".getBytes();
        for (int i = 0; i <bytes.length ; i++) {
            System.out.println(bytes[i]);
        }

        //8.int indexOf(String str)   判断某个字符串在当前字符串中第一次出现的索引
        System.out.println("abcd".indexOf("b"));

        //9.boolean isEmpty()  判断某个字符串是否为空
        String s = "ab";
        System.out.println("s".isEmpty());

        //10.String replace(char oldChar, char newChar) 替换字符串
        String newString = "abcd=abcd=".replace("=",";");
        System.out.println(newString);

        //11.String[] split(String regex)  通过指定字符串进行拆分
        String [] newString2 ="1980-10-01".split("-");
        for (int i = 0; i < newString2.length ; i++) {
            System.out.print(newString2[i]);
        }

        //12.String substring(int beginIndex, int endIndex)  截取字符串
        System.out.println("http://www.baidu.com".substring(7));
        System.out.println("http://www.baidu.com".substring(7,10));//实际下标7~9

        //13.String toLowerCase()  转为小写
        System.out.println("ABC".toLowerCase());

        //14.String toUpperCase()  转为大写
        System.out.println("abcD".toUpperCase());

        //15.String trim()   去除前后空白
        System.out.println("     abc  ad".trim());

        //16.static String valueOf(boolean b)   将非字符串转换为字符串
        String s1 = String.valueOf(100);
        System.out.println(s1);
        String s2 = String.valueOf(new Customer());
        System.out.println(s2);











    }
}
class  Customer{


}
