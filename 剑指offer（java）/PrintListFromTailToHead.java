/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/

import java.util.ArrayList;
public class Solution {
    //使用头插法
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        // 头插法构建逆序链表
        ListNode head = new ListNode(-1);
        while (listNode != null) {
            ListNode memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }
        // 构建 ArrayList
        ArrayList<Integer> ret = new ArrayList<>();
        head = head.next;
        while (head != null) {
            ret.add(head.val);
            head = head.next;
        }
        return ret;
    }


    // //使用递归
    // public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
    //     ArrayList<Integer> ret = new ArrayList<>();
    //     if(listNode != null){
    //         ret.addAll(printListFromTailToHead(listNode.next));
    //         ret.add(listNode.val);
    //     }
    //     return ret;
    // }


    // //使用栈
    // public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
    //     Stack<Interger> stack = new Stack<>();
    //     while(listNode!=null){
    //         stack.add(listNode.val);
    //         listNode = listNode.next;
    //     }
    //     ArrayList<Interger> ret = new ArrayList<>();
    //     while (!stack.isEmpty()){
    //         ret.add(stack.pop());
    //     return ret;
    //     }
    // }
}