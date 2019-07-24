package com.stackroute.pe5;
import java.util.*;
public class ArrayElements {
    public List<String> list = new ArrayList<>();

    // convert array of string to List
    public List<String> addArray(String[] inputArray) {
        for (String input : inputArray) {
            list.add(input);
            System.out.println(list);
        }
        return list;
    }

    //  remove all element of list
    public List<String> removeAll() {
        list.clear();
        return list;
    }

    // replace list value with respective index
    public List<String> update(int index, String value) {
        list.set(index, value);
        return list;
    }
}
