package com.mka.classes.innerclasses;

public class Main {
  public static void main(String[] args) {
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();
    inner.innerMethod();
    inner.printOuterPrivateVariable();
    inner.invokeOuterMethod();
  }
}
