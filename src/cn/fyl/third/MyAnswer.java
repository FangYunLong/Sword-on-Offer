package cn.fyl.third;

import java.util.ArrayList;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * Created by Fang on 2017/9/22.
 */
public class MyAnswer {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        for(ListNode current = listNode; current != null; current = current.next){
            list.add(current.val);
        }

        ArrayList<Integer> newList = new ArrayList();
        //数组索引越界 -1
        for(int size = list.size() - 1; size >= 0; size--){
            System.out.print(list.get(size).toString());
            newList.add(list.get(size));
        }
        System.out.println();
        return newList;
    }

}
