package Z5数组相关知识;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr = {100, 200, 230, 600, 1000, 2000, 9000};

        int index = Arrays.binarySearch(arr, 2000);
        System.out.println(index == -1 ? "该元素不存在" : "该元素下标：" + index);
    }


}
