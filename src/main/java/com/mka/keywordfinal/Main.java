package com.mka.keywordfinal;

public class Main {
  public static void main(String[] args) {
    FinalClass test = new FinalClass(1);
    System.out.println(test.field1);
    test = new FinalClass(4);
    System.out.println(test.field1);
  }
}

final class FinalClass {
  public int field1;

  FinalClass(int field1) {
    this.field1 = field1;
  }
}
