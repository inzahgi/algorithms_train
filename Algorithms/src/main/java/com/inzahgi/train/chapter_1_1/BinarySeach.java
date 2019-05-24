package com.inzahgi.train.chapter_1_1;

public class BinarySeach {

    public static int rank(int[] a, int k){
        return rank(a, k, 0, a.length - 1);
    }

    public static int rank(int[] a, int k, int lo, int hi){
        if(lo >= hi) {
            return -1;
        }
        int mid = (a[lo] + a[hi])/2;
        if(k == mid){
            return mid;
        }else if(k > mid){
            return rank(a, k, mid+1, hi);
        }else if(k < mid){
            return rank(a, k, lo, mid -1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1 ,2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(rank(a, 5));
    }
}
