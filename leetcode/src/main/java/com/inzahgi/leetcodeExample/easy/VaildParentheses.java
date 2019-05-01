package com.inzahgi.leetcodeExample.easy;

public class VaildParentheses {



    public boolean isValid(String s) {
        if(s.length() == 0) {
            return false;
        }
        char[] aArr = s.toCharArray();
        char[] stackArr = new char[aArr.length];
        int len = 0;
        for (int i = 0; i < aArr.length; i++) {
            if(getCharType(aArr[i]) != 0){

            }

        }
        return false;
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

    private boolean isParentheses(char c1, char c2){
        boolean res = false;
        switch(c1) {
            case '{':
                 return c2 == '}';
            case '[':
                return c2 == ']';
            case '(':
                return c2 == ')';
            default:
                return false;
        }
    }

    public static void main(String[] args) {

        String input = "{{[()]}}";
        VaildParentheses vp = new VaildParentheses();
        System.out.println(vp.isValid(input));
    }

}
