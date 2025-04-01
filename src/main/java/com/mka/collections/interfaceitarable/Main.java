package com.mka.collections.interfaceitarable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    usingIterator();
    removeElementFromCollection();
  }

  private static void usingIterator() {
    /*
     * Интерфейс Iterable является базовым интерфейсом для всех коллекций
     * Этот интерфейс содержит метод iterator(), который возвращает объект типа Iterator, посредством которого происходит перебор элементов
     */
    List<String> nikcks = List.of("mka", "qwer", "ver", "vsar");
    Iterator<String> iterator = nikcks.iterator();
    while (iterator.hasNext()) {
      String nick = iterator.next();
      System.out.println(nick);
    }
  }

  private static void removeElementFromCollection() {
    List<String> nikcks = new ArrayList<>();
    nikcks.add("qwer");
    nikcks.add("ver");
    nikcks.add("mka");
    for (String nick : nikcks) {
      if (nick.equals("ver")) {
        // удаляет элемент из исходной коллекции
        nikcks.remove(nick);
      }
    }
    for (String nick : nikcks) {
      System.out.println(nick);
    }
  }
}
