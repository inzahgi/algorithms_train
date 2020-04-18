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

    public int reverse_1(int x) {
        if(x < 10 && x > -10){
            return x;
        }
        int flag = x > 0 ? 1 : -1;
        x = x*flag;
        int[] ar = new int[12];
        int r = 0, j = -1;
        while (x != 0){
            r = x %10;
            x = x / 10;
            ar[++j] = r;

        }
        long res = 0;
        for (int i = 0; i <= j ; i++) {
            res = res*10 + ar[i];
        }
        r = (int)res*flag;
        if(r >= Integer.MAX_VALUE || r <= Integer.MIN_VALUE){
            return 0;
        }

        return r;


    }

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        //System.out.println(r.reverse_1(-120));
        System.out.println(r.reverse_1(1534236469));
    }
}
