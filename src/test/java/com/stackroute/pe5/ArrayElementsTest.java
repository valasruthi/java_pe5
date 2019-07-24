package com.stackroute.pe5;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayElementsTest {
    ArrayElements arrayElements;

    @org.junit.Before
    public void setUp() throws Exception {
        this.arrayElements=new ArrayElements();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        arrayElements=null;
    }
    @Test
    public void givenStringShouldReturnAddingArray() {
        String expected="[Kiwi, Grape, Mango, Berry]";
        String actual=arrayElements.addArray("Kiwi Grape Mango Berry".split(" ")).toString();
        assertEquals(expected,actual);
    }
    @Test
    public void givenStringRemoveAllList(){
        String expected="[]";
        String actual=arrayElements.removeAll().toString();
        assertEquals(expected,actual);
    }
    @Test
    public void givenStringShouldUpdateElements(){
        String expected="[Kiwi, Grape, Mango, Berry]";
        arrayElements.addArray("Apple Grape Melon Berry".split(" "));
        arrayElements.update(0,"Kiwi");
        String actual=arrayElements.update(2,"Mango").toString();
        assertEquals(expected,actual);

    }
}