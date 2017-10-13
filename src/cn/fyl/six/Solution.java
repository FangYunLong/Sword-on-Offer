package cn.fyl.six;

import java.time.chrono.MinguoChronology;

/**
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
        int minIndex = (left + right) / 2;
        while (array[left] > array[right]) {
            if (right - left == 1){
                minIndex = right;
                break;
            }
            minIndex = (left + right) / 2;
            if (array[minIndex] >= array[left]){
                left = minIndex;
            }
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
