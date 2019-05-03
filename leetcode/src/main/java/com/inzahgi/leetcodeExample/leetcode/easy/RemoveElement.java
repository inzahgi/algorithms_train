package com.inzahgi.leetcodeExample.leetcode.easy;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int i = 0, j = 0;
        for (; j < nums.length; j++){
            if(nums[j] == val){
                continue;
            }
            if(nums[i] != nums[j]){
                nums[i] = nums[j];
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] input = {0,1,2,2,3,0,4,2};
        RemoveElement r = new RemoveElement();
        System.out.println(r.removeElement(input, 2));
    }
}
