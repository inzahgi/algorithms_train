package com.inzahgi.leetcodeExample.onlyTest;

public class QuickStart {

    public void qSort(int[] a, int low, int hi){
        int temp, i, j, t;
        if(low > hi) {
            return;
        }
        i = low;
        j = hi;
        temp = a[low];
        while(i < j){
            while(temp < a[j] && (i < j)){
                j--;
            }
            while(temp >= a[i] && (i < j)){
                i++;
            }
            if(i < j){
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        a[low] = a[i];
        a[i] = temp;
        qSort(a, low, j-1);
        qSort(a, j+1, hi);
    }

    public static void main(String[] args) {
        int[] a = {6,5,8,12,5,32,4,2,9,1};
        QuickStart q = new QuickStart();
        q.qSort(a, 0, a.length-1);
        for (int t : a){
            System.out.println(t);
        }
    }
}
