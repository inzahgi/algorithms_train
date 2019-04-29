package com.inzahgi.leetcodeExample.onlyTest.meeting.model;

<<<<<<< HEAD


public class Event {
    private String name;
    private int duration;
    private int type;

    public Event(String name, int duration, int type) {
        this.name = name;
        this.duration = duration;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String toShow(){
        if(type == EVENT_TYPE.IS_LUNCH || type == EVENT_TYPE.IS_NETWORING){
            return name;
        }
        StringBuilder sb = new StringBuilder();
        if(type == EVENT_TYPE.IS_NORMAL){
            return sb.append(name).append(" ").append(duration).append("min").toString();
        }
        return sb.append(name).append(" ").append("lightning").toString();

=======
public class Event {

    private String Name;

    private long start;

    


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
>>>>>>> c92c775142431c453370f2e0bc6d86caccb930ab
    }
}
