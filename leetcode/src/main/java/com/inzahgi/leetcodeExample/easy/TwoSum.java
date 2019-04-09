package com.inzahgi.leetcodeExample.easy;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
// Example:
//
//
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].
//
//
//
//

import java.util.Arrays;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int i = 0, j = 0;
        for (; i < nums.length - 1; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }else
                    continue;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11 ,15};
        int[] res = twoSum.twoSum(nums, 9);
        for (int i = 0; i < res.length; i++) {
            System.out.println(i + " -------- " + res[i]);
        }
    }

}
