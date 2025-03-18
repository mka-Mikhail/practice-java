package com.mka.interfaces;

public interface ConstData {
  // Интерфейсы могут иметь поля, к которым неявно применяются модификаторы public, static и final
  // То есть поля нельзя изменить (у объектов неизменна ссылка, сами объекты могут изменять состояние)
  int integerNum = 10;
  float floatNum = 10f;
  String str = "STRING";
}
