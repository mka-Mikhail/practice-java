package com.mka.classes.innerclasses;

public class Outer {
  private int a = 10;

  private void outerMethod() {
    System.out.println("МЕТОД ВНЕШНЕГО КЛАССА\n");
  }

  public class Inner {
    public void innerMethod() {
      System.out.println("МЕТОД ВНУТРЕННЕГО КЛАССА\n");
    }
    public void printOuterPrivateVariable() {
      System.out.println("ВЫВОД ПРИВАТНОЙ ПЕРЕМЕННОЙ a ВНЕШНЕГО КЛАССА: " + Outer.this.a + "\n");
    }
    public void invokeOuterMethod() {
      System.out.println("ВЫЗОВ ПРИВАТНОГО МЕТОДА ВНЕШНЕГО КЛАССА\n");
      Outer.this.outerMethod();
    }
  }
}
