package com.mka.abstractclasses;

public class Main {
  public static void main(String[] args) {
    System.out.println(Abstract.NUM);
    System.out.println(new Test("hello").a);
  }
}

class Test extends Abstract {

  Test(String str) {
    super(str);
  }

  @Override
  int abstractMethod() {
    return 12;
  }
}

abstract class Abstract {
  public static final int NUM = 12;
  public final int a = 33;
  public String str;

  Abstract(String str) {
    this.str = str;
  }

  abstract int abstractMethod();
}
