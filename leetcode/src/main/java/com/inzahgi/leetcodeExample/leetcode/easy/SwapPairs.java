package com.inzahgi.leetcodeExample.leetcode.easy;


//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
//
// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
//
//
//
// 示例:
//
// 给定 1->2->3->4, 你应该返回 2->1->4->3.
//
// Related Topics 链表


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class SwapPairs {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {

        ListNode cur = head;
        while (cur != null && cur.next != null){
            int nVal = cur.next.val;
            cur.next.val = cur.val;
            cur.val = nVal;
            cur = cur.next.next;
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
