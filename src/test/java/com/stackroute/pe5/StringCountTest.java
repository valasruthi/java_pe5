package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class StringCountTest {
    StringCount stringCount;

    @Before
    public void setUp() throws Exception {
        this.stringCount=new StringCount();
    }

    @After
    public void tearDown() throws Exception {
        stringCount=null;
    }
    @Test
    public void givenStringAsInputShouldReturnCount(){
        Map<String,Integer> expected =new HashMap<String, Integer>();
        Map<String,Integer> actual =new HashMap<String, Integer>();

        //Act
        expected.put("one",5);
        expected.put("two",2);
        expected.put("three",2);

        actual = stringCount.countStr("one one one two three one three one two");
        //Assert
        assertEquals(expected, actual);
    }
}