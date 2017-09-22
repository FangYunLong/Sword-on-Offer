package cn.fyl.third;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Fang on 2017/9/22.
 */
public class SuperiorAnswer {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.empty()){
            list.add(stack.pop());
        }
        System.out.println();
        return list;
    }
}
