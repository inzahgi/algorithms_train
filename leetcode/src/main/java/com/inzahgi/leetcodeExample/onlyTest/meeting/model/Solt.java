package com.inzahgi.leetcodeExample.onlyTest.meeting.model;


public class Solt {
    private Event event;
    private int start;
    private int end;

    public Solt(Event event, int start, int end) {
        this.event = event;
        this.start = start;
        this.end = end;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public long getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String toShow(){
        int hour = start / 60;
        int min = start % 60;
        String timeSuffix;
        if(hour >= 12){
            hour = (hour %= 12) > 0 ? hour : 12;

            timeSuffix = "PM";
        }else {
            timeSuffix = "AM";
        }
        StringBuilder sb = new StringBuilder(128);
        if(hour < 10) {
            sb.append('0');
        }
        sb.append(hour).append(':');
        if(min < 10){
            sb.append("0");
        }

        return sb.append(min).append(timeSuffix).append(" ").append(event.toShow()).toString();
    }
}
