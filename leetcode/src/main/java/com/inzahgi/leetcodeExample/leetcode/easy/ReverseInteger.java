package com.inzahgi.leetcodeExample.leetcode.easy;

public class ReverseInteger {
    public int reverse(int x) {
        if(x < 10 && x > -10){
            return x;
        }
        int[] ar = new int[12];
        int i = -1;
        while(x != 0){
            int quo =  x / 10;
            int rem = x % 10;
            ar[++i] = rem;
            if(quo == 0){
                break;
            }
            x = quo;
        }

        int res = 0;
        for (int j = 0; j <= i; j++) {
            int tmp = ar[j] + res *10;
            if(res > tmp) {
                return 0;
            }
            res = tmp;
        }
        return res;
    }

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        System.out.println(r.reverse(-120));
    }
}
