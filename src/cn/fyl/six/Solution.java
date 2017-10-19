package cn.fyl.six;

import java.time.chrono.MinguoChronology;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * Created by Fang on 2017/10/13.
 */
public class Solution {
    public int minNumberInRotateArray(int [] array) {

        if(array == null || array.length==0){
            return 0;
        }
        if(array.length==1){
            return array[0];
        }

        int left = 0;
        int right = array.length - 1;
        int minIndex = 0;
        while (true) {
            //当左右指针相邻，右指针值为最小值
            if (right - left == 1){
                minIndex = right;
                break;
            }
            minIndex = (left + right) / 2;
            //中间值大于左指针值，中间值位于第一个递增数组
            if (array[minIndex] >= array[left]){
                left = minIndex;
            }
            //中间值小于右指针值，中间值位于第二个递增数组
            else if (array[minIndex] <= array[right]){
                right = minIndex;
            }
            if (array[left] == array[minIndex] && array[minIndex] == array[right]){
                return MinOrder(array);
            }
        }

        return array[minIndex];
    }

    private int MinOrder(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length - 1; i++){
            if (min > array[i+1]){
                min = array[i+1];
            }
        }
        return min;
    }
}
