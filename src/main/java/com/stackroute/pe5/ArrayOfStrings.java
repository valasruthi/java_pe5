package com.stackroute.pe5;

import java.util.*;

public class ArrayOfStrings {
    Map<String, Boolean> strArray(String[] array) {
        List list = Arrays.asList(array);
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        Set<String> set = new HashSet<String>(list);
        for (String s : set) {
            if (Collections.frequency(list, s) > 1) {
                map.put(s, true);
            } else {
                map.put(s, false);
            }

        }

        return map;
    }
}
