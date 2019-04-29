package com.inzahgi.leetcodeExample.onlyTest.meeting.util;

public class Constant {

    public interface SUFFIX{
        String MIN = "min";
        String LIGHTNING="lightning";
    }

    public interface ERR_MSG{
        String INPUT_STR = "解析输入字符串异常";
    }

    public interface TIME{
        int MORNING_START = 9 * 60;
        int LUNCH = 12 * 60;
        int AFTERNOON_START = 13 * 60;
        int NETWORK_NO_EARLIER = 16 * 60;
        int NETWORK_NO_LATTER = 17 * 60;
    }

    public interface EVENT_TYPE{
        int IS_NORMAL = 0;
        int IS_LIGHTING = 1;
        int IS_LUNCH = 2;
        int IS_NETWORING = 3;
    }
}
