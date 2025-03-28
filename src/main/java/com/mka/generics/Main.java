package com.mka.generics;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    Box<String> boxString = new Box<>("string");
    Box<Integer> integerBox = new Box<>(1);
    List<String> listString = List.of("str1", "str2", "str3", "str4", "str5");
    Box<List<String>> listStringBox = new Box<>(listString);
    Box<CustomObject> customObjectBox = new Box<>(new CustomObject("f1", "f2"));
    System.out.println(boxString.getT());
    System.out.println(integerBox.getT());
    System.out.println(listStringBox.getT());
    System.out.println(customObjectBox.getT());
    List<Box<?>> boxes = List.of(boxString, integerBox, listStringBox, customObjectBox);
    for (Box<?> box : boxes) {
      System.out.println(box.getT());
    }
  }
}

class Box<T> {
  private T t;

  Box(T t) {
    this.t = t;
  }

  public T getT() {
    return t;
  }
}

class CustomObject {
  public String field1;
  public String field2;

  CustomObject(String field1, String field2) {
    this.field1 = field1;
    this.field2 = field2;
  }
}
