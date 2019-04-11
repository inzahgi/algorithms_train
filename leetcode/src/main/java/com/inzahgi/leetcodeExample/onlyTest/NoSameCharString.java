package com.inzahgi.leetcodeExample.onlyTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NoSameCharString {

    public String findUniqueString(String str){
        int start = 0;
        int end = 0;
        int i = 0, j = 0;
        Map<Character, Integer> map = new HashMap();
        for (; j < str.length(); j++) {
            char ch = str.charAt(j);
            //如果已经包含字符
            if(map.containsKey(ch)){
                if((j-i) > (end -start)){
                    start = i;
                    end = j;
                }
                //更新i, j   i为之前保存的字符位置的下一个元素  然后更新该字符为当前位置
                if(map.get(ch) > i)
                    i = map.get(ch)+1;
                map.put(ch, j);
                continue;
            }
            map.put(ch, j);

        }
        if((j - i) > (end - start))
            return str.substring(i, j);
        else
            return str.substring(start, end);
    }

    public String findUniqueCharString2(String str) {
        int start = 0, end = 0;
        int i = 0, j = 1;
        for (; j < str.length(); j++) {
            char ch = str.charAt(j);
            if(j > 0) {
                for (int k = j - 1; k >= i; k--) {
                    if(str.charAt(k) == ch){
                        if((j-i) > (end -start)) {
                            start = i;
                            end = j;
                        }
                        i = k+1;
                    }
                }
            }
        }
        if((j - i) > (end -start))
            return str.substring(i, j);
        else
            return str.substring(start, end);


    }

    public static void main(String[] args) {
        NoSameCharString nscs = new NoSameCharString();
        //System.out.println(nscs.findUniqueString("ye1hude2e2uque82qu2"));
        System.out.println(nscs.findUniqueCharString2("ye1hude2e2uque82qu2"));
    }
}
