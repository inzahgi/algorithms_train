package com.inzahgi.leetcodeExample.onlyTest.meeting.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    /**
     * get input string list by file path
     * @param filePath input file Path
     * @return talks
     */
    public static List<String> getInput(String filePath){
        List<String> strList = new ArrayList<>();
        File inputFile = new File(filePath);
        if(!inputFile.exists() || !inputFile.isFile()){
            return strList;
        }
        try{
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line = reader.readLine()) != null){
                strList.add(line.trim());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return strList;
    }
}
