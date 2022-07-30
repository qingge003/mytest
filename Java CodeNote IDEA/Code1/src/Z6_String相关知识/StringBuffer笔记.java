package Z6_String相关知识;

/**
 * 如果以后需要进行大量字符串的拼接操作,建议使用:
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *
 */
public class StringBuffer笔记 {
    public static void main(String[] args) {
        StringBuffer stringBuffer  = new StringBuffer();
        //字符串拼接

        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("c");
        stringBuffer.append("3.14");
        stringBuffer.append("100L");
        System.out.println(stringBuffer);
    }



}
