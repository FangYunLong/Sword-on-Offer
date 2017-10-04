package cn.fyl.four;

import org.junit.Test;

/**
 * Created by Fang on 2017/10/4.
 */
public class TestAnswer {
    @Test
    public void test(){
        SuperiorAnswer answer = new SuperiorAnswer();
        int[] pre ={1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode root = answer.reConstructBinaryTree(pre,in);
    }
}
