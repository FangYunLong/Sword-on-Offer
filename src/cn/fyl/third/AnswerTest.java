package cn.fyl.third;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Fang on 2017/9/22.
 */
public class AnswerTest {
    @Test
    public void test(){
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);

        MyAnswer test = new MyAnswer();
        test.printListFromTailToHead(listNode);

        SuperiorAnswer spuerior = new SuperiorAnswer();
        ArrayList<Integer> list = spuerior.printListFromTailToHead(listNode);
        for (Integer i : list){
            System.out.print(i);
        }
    }
}
