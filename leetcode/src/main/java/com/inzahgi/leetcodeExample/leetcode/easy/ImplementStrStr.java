package com.inzahgi.leetcodeExample.leetcode.easy;

public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        char[] chOne = haystack.toCharArray();
        char[] chTwo = needle.toCharArray();

        if(chOne.length == chTwo.length){
            for (int i = 0; i < chOne.length; i++) {
                if(chOne[i] != chTwo[i]){
                    return -1;
                }
            }
            return 0;
        }
        if(chOne.length == 0 && chTwo.length != 0){
            return -1;
        }
        if(chTwo.length == 0){
            return 0;
        }

        for (int i = 0; i < chOne.length; i++) {
            if(chOne[i] != chTwo[0]) {
                continue;
            }
            if(i + chTwo.length > chOne.length){
                return -1;
            }

            for (int j = 0; j < chTwo.length; j++) {
                if(chOne[i+j] == chTwo[j]){
                    if(j == chTwo.length -1){
                        return i;
                    }
                    continue;
                }
                break;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ImplementStrStr i = new ImplementStrStr();
        //System.out.println(i.strStr("hollow", "ll"));
        //System.out.println(i.strStr("mississippi","issip"));
        System.out.println(i.strStr("mississippi", "sipp"));


    }
}
