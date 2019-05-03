package com.inzahgi.leetcodeExample.leetcode.easy;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1;
        while (j<nums.length){
            if(nums[i] == nums[j]){
                j++;
                continue;
            }
            if(j-i > 1){
                i++;
                nums[i]=nums[j];
                j++;
                continue;
            }
            i++;
            j++;


        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] input = {1,1,2,2,3,3,4};
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        System.out.println(r.removeDuplicates(input));
    }
}
