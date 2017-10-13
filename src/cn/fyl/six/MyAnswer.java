package cn.fyl.six;

import javax.crypto.AEADBadTagException;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * Created by Fang on 2017/10/13.
 */
public class MyAnswer {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0){
            return 0;
        }
        int min = array[0];
        for (int i = 1 ; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }

        int[] temp = new int[array.length];
        int size = array.length;
        if (size % 2 == 0) {
            for (int i = 0, j = size - 1; i < j; i++, j--) {
                temp[j] = array[i];
                temp[i] = array[j];
            }
        }
        else{
            for (int i = 0, j = size -1; i < size / 2; i++ , j--){
                temp[j] = array[i];
                temp[i] = array[j];
                temp[size/2] = array[size/2];
            }
        }
        array = temp;

        return min;
    }
}
