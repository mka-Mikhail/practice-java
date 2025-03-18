package com.mka.interfaces;

public interface Swimmable {
  // В интерфейсе может быть метод по умолчанию, который не нужно реализовывать
  default void swim() {
    System.out.println("Оно плавает");
  }
}
