package com.inzahgi.leetcodeExample.onlyTest.meeting.manage;




import com.inzahgi.leetcodeExample.onlyTest.meeting.model.Event;
import com.inzahgi.leetcodeExample.onlyTest.meeting.model.Solt;
import com.inzahgi.leetcodeExample.onlyTest.meeting.model.Track;

import static com.inzahgi.leetcodeExample.onlyTest.meeting.util.Constant.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SchedulerHelper {

    private static final Pattern MIN_PATTERN = Pattern.compile("^(.+)\\s(\\d+)(min)$");
    private static final Pattern LIGHTING_PATTERN = Pattern.compile("^(.+)\\s(lightning)$");

    /**
     *  transfer a talk to event class
     * @param str a talk
     * @return event
     */
    public static Event transferEvent(String str){
        if(str.endsWith(SUFFIX.MIN)){
            return parseInput(str, MIN_PATTERN, false);
        }else if(str.endsWith(SUFFIX.LIGHTNING)){
            return parseInput(str, LIGHTING_PATTERN, true);
        }else {
            return null;
        }
    }


    private static Event parseInput(String str, Pattern p, boolean isLighting){
        if(str.length() == 0){
            return null;
        }

        Matcher match = p.matcher(str);
        if(!match.find()){
            return null;
        }
        if(isLighting){
            String name = match.group(1);
            return new Event(name, 5, EVENT_TYPE.IS_LIGHTING);
        }else {
            String name = match.group(1);
            String duration = match.group(2);

            return new Event(name, Integer.valueOf(duration), EVENT_TYPE.IS_NORMAL);
        }

    }

    public static Track planOneTrack(List<Event> eventList){
        if(eventList == null || eventList.size() == 0){
            return null;
        }
        List<Solt> soltList = new ArrayList<>();
        int start = TIME.MORNING_START;
        int end = start;
        soltList.addAll(getEventByDuration(eventList, start, (TIME.LUNCH - start)));
        start = TIME.LUNCH;
        end = start +  60;
        Event lunchEvent = new Event("Lunch", 60, EVENT_TYPE.IS_LUNCH);
        soltList.add(new Solt(lunchEvent, start, end));
        start = end;

        soltList.addAll(getEventByDuration(eventList, start, (TIME.NETWORK_NO_LATTER - start)));

        start = TIME.NETWORK_NO_LATTER;
        end = start +  60;
        Event networkEvent = new Event("Networking Event", 60, EVENT_TYPE.IS_NETWORING);
        soltList.add(new Solt(networkEvent, start, end));

        Track track = new Track();
        track.setSoltList(soltList);
        return track;
    }

    private static List<Solt> getEventByDuration(List<Event> list, int start, int duration){
        List<Solt> resList = new ArrayList<>();
        while (duration > 0){
            int i = findEvent(list, duration);
            if(i == -1){
                return resList;
            }
            Event e = list.get(i);
            int end = start + e.getDuration();
            resList.add(new Solt(e, start, end));
            start = end;
            duration -= e.getDuration();
            list.remove(i);
        }
        return resList;

    }

    private static int findEvent(List<Event> list, int duration){
        int i = 0;

        for (;  i< list.size(); i++) {
            Event e = list.get(i);
            if(e.getDuration() < duration){
                return i;
            }
        }
        return -1;
    }





}



