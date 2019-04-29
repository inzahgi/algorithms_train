package com.inzahgi.leetcodeExample.onlyTest.meeting.model;

import java.util.List;

public class Track {

    private List<Solt> soltList;

    public List<Solt> getSoltList() {
        return soltList;
    }

    public void setSoltList(List<Solt> soltList) {
        this.soltList = soltList;
    }


    public String toShow(){
        StringBuilder sb = new StringBuilder(1024);
        for (Solt solt : soltList){
            sb.append(solt.toShow()).append("\n");
        }
        return sb.toString();
    }



}
