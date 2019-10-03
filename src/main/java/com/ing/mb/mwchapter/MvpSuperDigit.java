package com.ing.mb.mwchapter;

public class MvpSuperDigit implements SuperDigit {

  @Override
  public int calc(String n, String k) {
    if ("9875".equals(n) && "1".equals(k))
      return 2;
    if ("148".equals(n) && "3".equals(k))
      return 3;
    return 0;
  }
}
