package Note2;

import java.util.Arrays;
import java.util.Random;

/**
 * @author chenweidong
 * @date 2022/7/11 18:27
 * TODO:
 */
public class c5_Random {

}
/**
 * 生成5个不同的0-100的随机数,重复的话重新生成,最终生成的数存到数组中
 */
class RandomTest01{
    public static void main(String[] args) {
        Random random = new Random();

        int [] arr = {-1,-1,-1,-1,-1};
   
        int index = 0;
        while (index < arr.length){
            int num = random.nextInt(6);
            if (!contains(arr,num)) {
                arr[index] = num;
                index++;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }

    /**
     * 判断数组中是否包含某个元素
     * @param arr
     * @param key
     * @return true表示包含,false表示不包含
     */
    public static boolean contains(int [] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }


}
