package com.inzahgi.leetcodeExample.onlyTest.meeting.model;

public class TimeWheel {
    private int[] hours;

    private int[] mins;

    private int curHour;

    private int curMin;

    public TimeWheel(int startHour, int startMin){
        hours = new int[24];
        mins = new int[60];
        curHour = startHour;
        curMin = startMin;
    }


}
