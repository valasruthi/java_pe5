package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ArrayOfStringsTest {
      ArrayOfStrings arrayOfStrings;
    @Before
    public void setUp() throws Exception {
        this.arrayOfStrings=new ArrayOfStrings();
    }

    @After
    public void tearDown() throws Exception {
        arrayOfStrings=null;
    }
    @Test
    public void givenStringAsInputShouldReturnAValue() {
        String str[]={"a","b","c","d","a","c","c"};
        Map<String,Boolean> expectedValue =new HashMap<String, Boolean>();
        Map<String,Boolean> actualValue =new HashMap<String, Boolean>();

        //Act
        expectedValue.put("a",true);
        expectedValue.put("b",false);
        expectedValue.put("c",true);
        expectedValue.put("d",false);

        actualValue = arrayOfStrings.strArray(str);
        //Assert
        assertEquals(expectedValue, actualValue);

    }
    @Test
    public void givenStringAsInputShouldReturnFalse() {
        String str[]={"a","b","c","d"};
        Map<String,Boolean> expectedValue =new HashMap<String, Boolean>();
        Map<String,Boolean> actualValue =new HashMap<String, Boolean>();

        //Act
        expectedValue.put("a",false);
        expectedValue.put("b",false);
        expectedValue.put("c",false);
        expectedValue.put("d",false);

        actualValue = arrayOfStrings.strArray(str);
        //Assert
        assertEquals(expectedValue, actualValue);

    }
}