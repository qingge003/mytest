package Z5数组相关知识;
//找出87的下标，如果没有返回-1
public class ArraySearch {
    public static void main(String[] args) {
        int [] arr = {4,5,6,87,8};

        int index = arraySearch(arr,8);
        System.out.println(index == -1 ?"该元素不存在":"该元素下标是："+ index);
    }

    /**
     * 从数组中检索某个元素的下标
     * @param arr 被检索的数组
     * @param ele 被检索的元素
     * @return 大于等于0的数表示元素的下标，-1表示该元素不存在
     */

    public static int arraySearch(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
