package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModifyKeyTest {
ModifyKey modifyKey;
  @Before
  public void setUp() throws Exception {
    this.modifyKey=new ModifyKey();
  }

  @After
  public void tearDown() throws Exception {
    modifyKey=null;
  }
  @Test
  public void givenKeyShouldReturnTheModifiedValue() {
    Map<String,String> map =new HashMap<String, String>();
    Map<String,String> expectedValue =new HashMap<String, String>();
    Map<String,String> actualValue =new HashMap<String, String>();

    //Act
    map.put("val1","java");
    map.put("val2","c++");
    expectedValue.put("val1"," ");
    expectedValue.put("val2","java");

    actualValue = modifyKey.modifykey(map);
    //Assert
   assertEquals(expectedValue, actualValue);
  }
}
