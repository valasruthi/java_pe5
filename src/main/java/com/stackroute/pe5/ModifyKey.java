package com.stackroute.pe5;
import java.util.*;
public class ModifyKey {
  Map<String, String> modifykey(Map<String, String> map) {
    map.replace("val2", map.get("val1"));
    map.replace("val1", " ");
    return map;

  }
}
