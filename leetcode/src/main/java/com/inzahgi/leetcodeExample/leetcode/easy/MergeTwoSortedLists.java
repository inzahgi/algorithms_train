package com.inzahgi.leetcodeExample.leetcode.easy;

import com.inzahgi.leetcodeExample.leetcode.model.ListNode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode head = null;
        ListNode cur = null;
        ListNode pre = null;

        while (l1 != null && l2 != null){
            if(l1.getVal() > l2.getVal()){
                cur = l2;
                l2 = l2.getNext();
            }else {
                cur = l1;
                l1 = l1.getNext();
            }
            if(head == null){
                head = cur;
            }else{
                pre.setNext(cur);
            }
            pre = cur;
            cur = cur.getNext();
        }
        if(l1 == null){
           pre.setNext(l2);
        }

        if(l2 == null){
           pre.setNext(l1);
        }
        return head;
    }

    public static ListNode creatListNode(List<Integer> l){
        ListNode head = null;
        ListNode cur = null;
        ListNode pre = null;
        for (Integer i : l){
            cur = new ListNode(i);
            if(head == null){
                head = cur;
            }else {
                pre.setNext(cur);
            }
            pre = cur;
            cur = cur.getNext();
        }
        return head;
    }

    public static void printListNode(ListNode ln){
        if(ln == null){
            System.out.println("");
            return;
        }
        System.out.printf("-> %d\t", ln.getVal());
        printListNode(ln.getNext());
    }

    public static void main(String[] args) {
        MergeTwoSortedLists m = new MergeTwoSortedLists();
        ListNode l1 = creatListNode(Arrays.asList(1, 3, 4));
        ListNode l2 = creatListNode(Arrays.asList(1, 2, 4));
        printListNode(l1);
        printListNode(l2);
        ListNode r = m.mergeTwoLists(l1, l2);
        printListNode(r);
    }
}
