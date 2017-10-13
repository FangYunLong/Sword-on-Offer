package cn.fyl.six;


import org.junit.Test;

/**
 * Created by Fang on 2017/10/13.
 */
public class TestAnswer {
    @Test
    public void test(){
        Solution solution = new Solution();
        int[] test = {3,4,5,1,2};
        int min = solution.minNumberInRotateArray(test);
        System.out.print("min:"+min);

    }
}
