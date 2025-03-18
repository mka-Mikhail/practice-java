package com.mka.interfaces;

public class Main {
  public static void main(String[] args) {
    Duck duck = new Duck();
    Fish fish = new Fish();
    duck.swim();
    fish.swim();
    duck.sound();
    fish.sound();

    System.out.println(ConstData.floatNum);
    System.out.println(ConstData.integerNum);
    System.out.println(ConstData.str);
  }
}
