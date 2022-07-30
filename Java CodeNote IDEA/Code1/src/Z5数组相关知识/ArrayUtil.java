package Z5数组相关知识;
/**
 *  todo:数组使用“二分法”查找元素（折半查找）
 */
public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = {100, 200, 230, 600, 1000, 2000, 9000};

        int index = binarySearch(arr, 2000);
        System.out.println(index == -1 ? "该元素不存在" : "该元素下标：" + index);
    }

    public static int binarySearch(int[] arr, int dest) {
        int begin = 0;
        int end = arr.length - 1;

        while (begin <= end) {
            int mid = (begin + end) / 2;

            if (arr[mid] == dest) {
                return mid;
            } else if (arr[mid] < dest) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
            return 0;
        }

}
