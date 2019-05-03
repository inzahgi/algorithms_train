package com.inzahgi.leetcodeExample.leetcode.easy;

public class VaildParentheses {



    public boolean isValid(String s) {
        if(s.length() == 0) {
            return true;
        }
        char[] aArr = s.toCharArray();
        int[] stackArr = new int[aArr.length];
        int len = -1;
        for (int i = 0; i < aArr.length; i++) {
            int chType = getCharType(aArr[i]);
            if(chType == 0){
                continue;
            }

            if (len != -1 && chType > 0) {
                if (chType != -stackArr[len]) {
                    return false;
                } else {
                    len--;
                    continue;
                }
            }

            len++;
            stackArr[len] = chType;

        }
        return len == -1;
    }

    private int getCharType(char c){
        int i = 0;
        switch (c){
            case '{': i = -1;break;
            case '[': i = -2;break;
            case '(': i = -3;break;
            case ')': i = 3;break;
            case ']': i = 2;break;
            case '}': i = 1;break;
            default:break;
        }
        return i;
    }


    public static void main(String[] args) {

        //String input = "{{[()]}}";
        String input = "{[)]";
        VaildParentheses vp = new VaildParentheses();
        System.out.println(vp.isValid(input));
    }

}
