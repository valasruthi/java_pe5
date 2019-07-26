package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
public class ManifestTest {
  private Manifest manifest;
  @Before//creating an instance of manifest class
  public void setUp() {
    manifest = new Manifest();
  }
  @After
  public void tearUp(){
    manifest=null;
  }
  @Test//testing for sorted student details
  public void givenMethodWillCheckForSortedStudentInputDeatils(){
    //input list
    StudentData student1=new StudentData (82,"sruthi",42);
    StudentData  student2=new StudentData (22,"kiranmai",42);
    StudentData  student3=new StudentData (62,"chinni",33);
    List<StudentData > list=new ArrayList<>();
    list.add(student1);
    list.add(student2);
    list.add(student3);

    //act
    List<StudentData > student=manifest.sortingMethod(list);
    //expected sorted list
    List<StudentData > list1=new ArrayList<>();
    list1.add(student2);
    list1.add(student1);
    list1.add(student3);
    //assert
    assertEquals(list1,student);
  }
  @Test
  public void givenMethodShouldCheckForNullInputList(){
    List list=new ArrayList();
    //act
    List<StudentData> student=manifest.sortingMethod(list);
    //asert
    assertNull(student);
  }
}
