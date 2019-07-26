package com.stackroute.pe5;

import java.util.Comparator;

public class StudentSorter implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
      StudentData age = (StudentData) o1;
      StudentData age1 = (StudentData) o2;
      if (age.getAge() == age1.getAge()) {    //checking for student ages
        if (age.getName().equals(age1.getName())) { //checking for studentnames
          {
            if (age.getId() == age1.getId())//checking for studentid
              return 0;
            else if (age.getId() > age.getId())
              return -1;
            else
              return 1;
          }
        }
        else {
          return -age.getName().compareTo(age1.getName());
        }
      }
      else if (age.getAge() > age1.getAge()) {
        return -1;
      } else {
        return 1;
      }
    }
}
