package cn.fyl.six;

import cn.fyl.six.MyAnswer;
import org.junit.Test;

/**
 * Created by Fang on 2017/10/13.
 */
public class TestAnswer {
    @Test
    public void test(){
        MyAnswer answer = new MyAnswer();
        int[] test = {1,3,5,2,6};
        int min = answer.minNumberInRotateArray(test);
        System.out.print("min:"+min);

    }
}
