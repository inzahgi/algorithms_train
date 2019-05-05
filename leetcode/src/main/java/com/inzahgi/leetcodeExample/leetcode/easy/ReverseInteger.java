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

        long res = 0;
        for (int j = 0; j <= i; j++) {
            long tmp = ar[j] + res *10;
            res = tmp;
        }
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)res;
    }

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        System.out.println(r.reverse(-120));
    }
}
