package com.inzahgi.train.chapter_1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Average {
    public static void main(String[] args) {
        double sum = 0.0;
        int cnt = 0;
        while (!StdIn.isEmpty()){
            double tmp = StdIn.readDouble();
            sum += tmp;
            cnt++;
            StdOut.printf("add tmp = %f  sum = %f  cnt = %d\n", tmp, sum, cnt);
        }
        double average = sum/cnt;
        StdOut.printf("average = %f\n", average);

    }
}
