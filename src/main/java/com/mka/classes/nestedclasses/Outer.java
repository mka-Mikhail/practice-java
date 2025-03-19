package com.mka.classes.nestedclasses;

public class Outer {
  private static int a = 10;

  private static void outerStaticMethod() {
    System.out.println("ПРИВАТНЫЙ СТАТИЧЕСКИЙ МЕТОД ВНЕШНЕГО КЛАССА\n");
  }

  public static class Nested {
    public void nestedMethod() {
      System.out.println("МЕТОД ВЛОЖЕННОГО КЛАССА\n");
    }
    public void printOuterStaticVariable() {
      System.out.println("ВЫВОД СТАТИЧЕСКОЙ ПЕРЕМЕННОЙ a ВНЕШНЕГО КЛАССА: " + Outer.a + "\n");
    }
    public void invokePrivateStaticOuterMethod() {
      System.out.println("ВЫЗОВ ПРИВАТНОГО СТАТИЧЕСКОГО МЕТОДА ВНЕШНЕГО КЛАССА");
      Outer.outerStaticMethod();
    }
    public static void nestedStaticMethod() {
      System.out.println("СТАТИЧЕСКИЙ МЕТОД ВЛОЖЕННОГО КЛАССА\n");
    }
  }
}
