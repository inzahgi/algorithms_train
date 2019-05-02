package com.inzahgi.leetcodeExample.onlyTest.meeting.manage;



import com.inzahgi.leetcodeExample.onlyTest.meeting.model.Conference;
import com.inzahgi.leetcodeExample.onlyTest.meeting.model.Event;
import com.inzahgi.leetcodeExample.onlyTest.meeting.model.Track;

import java.util.ArrayList;
import java.util.List;



public class SchedulerManage {
    private Conference conference;

    /**
     *  scheduler conference
     * @param stringList  input talks
     */
    public SchedulerManage(List<String> stringList){
        List<Event>eventList = transferToEvent(stringList);
        List<Track> trackList = plan(eventList);
        conference = new Conference();
        conference.setTrackList(trackList);
    }

    /**
     *  talks transfer to events class
     * @param stringList input talks
     * @return events
     */
    public static List<Event> transferToEvent(List<String> stringList) {
        List<Event> eventList = new ArrayList<>();
        for (String str : stringList) {
            Event event = SchedulerHelper.transferEvent(str);
            if(event != null){
                eventList.add(event);
            }
        }
        return eventList;
    }

    /**
     *  combine some talks to track
     * @param eventList all talks
     * @return tracks
     */
    public static List<Track> plan(List<Event> eventList){
        List<Track> tackList = new ArrayList<>();
        while(eventList.size() > 0){
            Track track = SchedulerHelper.planOneTrack(eventList);
            tackList.add(track);
        }
        return tackList;
    }

    public void printTrack(){
        List<Track> trackList = conference.getTrackList();
        for (int i = 0; i < trackList.size(); i++) {
            System.out.printf("Track %d:\n", i+1);
            System.out.println(trackList.get(i).toShow());
        }
    }
}
