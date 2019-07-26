package com.stackroute.pe5;
import java.util.*;
public class SetSorter {
    public List<String> sortedList(String[] inputString) {
//creation of arraylist
      ArrayList<String> newArrayList = new ArrayList<>();
      for (String str : inputString) {
        newArrayList.add(str);
      }
      //creation of treeset and it will automatically sort the given input
      Set treeSet = new TreeSet(newArrayList);
      //storing sorted set into list
      List list = new ArrayList(treeSet);
      System.out.println(list);
      return list;
    }
  }
}
