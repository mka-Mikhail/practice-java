package com.mka.classes.nestedclasses;

public class Main {
  public static void main(String[] args) {
    Outer.Nested test = new Outer.Nested();
    test.nestedMethod();
    Outer.Nested.nestedStaticMethod();
    test.printOuterStaticVariable();
    test.invokePrivateStaticOuterMethod();
  }
}
