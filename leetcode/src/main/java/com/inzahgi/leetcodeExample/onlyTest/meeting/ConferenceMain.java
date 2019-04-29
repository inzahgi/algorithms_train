package com.inzahgi.leetcodeExample.onlyTest.meeting;



import com.inzahgi.leetcodeExample.onlyTest.meeting.manage.SchedulerManage;
import com.inzahgi.leetcodeExample.onlyTest.meeting.util.FileUtil;

import java.util.List;


public class ConferenceMain {



    public static void main(String[] args) {
        if(args.length < 1 ){
            System.out.println("Usage : java com.inzahgi.example.ConferenceMain filePath");
            System.exit(1);
        }

        List<String> strList = FileUtil.getInput(args[0]);
        if(strList == null || strList.size() == 0){
            System.out.println("input is empty!!!");
            return;
        }
        SchedulerManage sm = new SchedulerManage(strList);
        sm.printTrack();
    }
}
