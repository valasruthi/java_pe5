package com.stackroute.pe5;
import java.util.*;
public class StringCount {
    Map<String, Integer> countStr(String str) {
        String array[] = str.split(" ");
        List list = Arrays.asList(array);
        Map<String, Integer> map = new HashMap<String, Integer>();
        Set<String> set = new HashSet<String>(list);
        for (String s : set) {

            map.put(s, Collections.frequency(list, s));
        }
        return map;
    }
}
