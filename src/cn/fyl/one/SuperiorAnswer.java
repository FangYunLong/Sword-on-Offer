package cn.fyl.one;

/**
 * 根据数组是有序的，从上到下，从左到右递增，
 * 从左下角开始寻找，
 * 数组元素大了，上移，小了，右移。
 * Created by Fang on 2017/9/21.
 */
public class SuperiorAnswer {
    public boolean Find(int target, int[][] array){
        int row = array.length - 1;
        int col = 0;
        while(row > 0 && col < array[row].length){
            if (array[row][col] > target){
                row--;
            }
            else if(array[row][col] < target){
                col++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
