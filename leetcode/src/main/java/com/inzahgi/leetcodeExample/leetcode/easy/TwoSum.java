package com.inzahgi.leetcodeExample.leetcode.easy;

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

import java.util.HashMap;

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

    public int[] twoSum_2(int[] nums, int target) {
        int[] res = new int[2];
        if(nums == null || nums.length < 2){
            return res;
        }
        HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            dict.put(nums[i], i);
        }


        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if(dict.containsKey(tmp)){
                int j = dict.get(tmp);
                if(i != j) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        //int[] nums = {2, 7, 11 ,15};
        //int[] res = twoSum.twoSum_2(nums, 9);
        int[] nums = {3, 2, 4};
        int[] res = twoSum.twoSum_2(nums, 6);
        for (int i = 0; i < res.length; i++) {
            System.out.println(i + " -------- " + res[i]);
        }
    }

}
