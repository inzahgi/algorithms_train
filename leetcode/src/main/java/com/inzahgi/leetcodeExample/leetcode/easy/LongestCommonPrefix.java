package com.inzahgi.leetcodeExample.leetcode.easy;

public class LongestCommonPrefix {


    public String longestCommonPrefix(String[] strs) {
        if(strs == null ||strs.length == 0)
            return "";
        for (int i = 0; i < strs.length; i++) {
            if(strs[i] == null)
                return "";
        }
        if(strs.length == 1)
            return strs[0];
        int end = 0;
        boolean findLastFlag = false;
        //外层循环 按字符串 增加位置
        for (int i = 0; i < strs[0].length(); i++) {
            //获取当前需要比较的字符串
            char ch = strs[0].charAt(i);
            //遍历字符串数组
            for (int j = 0; j < strs.length; j++) {
                //当 比较位置大于等于 当前字符串长度  或者 当前字符 不是比较字符 跳出循环
                if(i>= strs[j].length() || strs[j].charAt(i) != ch){
                    findLastFlag = true;
                    break;
                }
            }
            if(findLastFlag){
                break;
            }
            end++;
        }
        if(end == 0)
            return "";
        return strs[0].substring(0, end);
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        //String[] testStrs = {"abcdefghijk", "abcdefkjhf", "abcdejhk"};
        //String[] testStrs = {"dog","racecar","car"};
        String[] testStrs = {};
        System.out.println(lcp.longestCommonPrefix(testStrs));
    }
}
