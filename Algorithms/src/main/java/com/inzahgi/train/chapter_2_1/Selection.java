package com.inzahgi.train.chapter_2_1;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class Selection {

    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = 0; j < N; j++) {
                if(less(a[j], a[min])){
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    public static void drawSort(Comparable[] a){
        int N = a.length;
        StdDraw.setYscale(N +4, 0);
        StdDraw.setXscale(0, N + 3);
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.text(3 + N/2, 0.4, "a[]");
        StdDraw.textRight(1, 1, "i");
        StdDraw.textRight(2, 1, "min");
        for (int i = 0; i < N; i++) {
            StdDraw.text(3+i, 1, i+ "");
            StdDraw.text(3 + i, 2, a[i].toString());
        }
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++){
                
            }
        }
    }

    public static void main(String[] args) {

    }
}
