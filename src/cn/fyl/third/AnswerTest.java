package cn.fyl.third;

import org.junit.Test;

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
    }
}
