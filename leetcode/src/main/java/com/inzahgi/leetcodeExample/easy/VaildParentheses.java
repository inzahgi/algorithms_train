package com.inzahgi.leetcodeExample.easy;

public class VaildParentheses {


    //todo
    public boolean isValid(String s) {
        if(s.length() == 0) {
            return false;
        }
        char[] aArr = s.toCharArray();

        for (int i = 0, j = aArr.length -1; i < j; i++, j--) {
            char c1 = aArr[i];

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
