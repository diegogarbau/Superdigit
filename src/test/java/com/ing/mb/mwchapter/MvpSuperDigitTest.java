package com.ing.mb.mwchapter;

import org.junit.jupiter.api.Disabled;

class MvpSuperDigitTest extends SuperDigitAbstractTest {

  @Override
  public SuperDigit getSut() {
    return new MvpSuperDigit();
  }

  @Override
  @Disabled
  void extralongSuperDigits(String rep, String seed, int expected) {
    super.extralongSuperDigits(rep, seed, expected);
  }

  @Override
  @Disabled
  void extendedSuperDigits(String rep, String seed, int expected) {
    super.extendedSuperDigits(rep, seed, expected);
  }

  @Override
  void knownSuperDigits(String rep, String seed, int expected) {
    super.knownSuperDigits(rep, seed, expected);
  }
}