package com.inzahgi.leetcodeExample.leetcode.easy;

public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        char[] chOne = haystack.toCharArray();
        char[] chTwo = needle.toCharArray();

        for (int i = 0; i < chOne.length; i++) {
            if(chOne[i] != chTwo[0]) {
                continue;
            }
            if(i + chTwo.length >= chOne.length){
                return -1;
            }

            for (int j = 0; j < chTwo.length; j++) {
                if(chOne[i+j] == chTwo[j]){
                    continue;
                }
            }
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        ImplementStrStr i = new ImplementStrStr();

    }
}
