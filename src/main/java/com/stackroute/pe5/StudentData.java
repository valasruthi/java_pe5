package com.stackroute.pe5;
import java.util.*;
public class StudentData {
  private int id;
  @Override
  public String toString() {
    return "Student{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", age=" + age +
      '}';
  }
  public StudentData(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }
  private String name;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  private int age;
}

