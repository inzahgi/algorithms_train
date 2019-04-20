package com.inzahgi.leetcodeExample.onlyTest.meeting.condition;

public interface Cond {

    boolean isAddPlan();

    default boolean isFitTime(){
        return true;
    }
}
