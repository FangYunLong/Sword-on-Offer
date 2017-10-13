package cn.fyl.six;

/**
 * Created by Fang on 2017/10/13.
 */
public class Solution {
    public int minNumberInRotateArray(int [] array) {


        if(array.length==0){
            return 0;
        }
        if(array.length==1){
            return array[0];
        }

        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                return array[i+1];
            }else{
                if(i==array.length-2){
                    return array[0];
                }
            }
        }

        return 0;
    }
}
