package com.mka.enums;

public enum Response {
  ACK("ACK"),
  PRC("PRC"),
  ERR("ERR");

  public String responseBody;

  private Response(String responseBody) {
    this.responseBody = responseBody;
  }
}
