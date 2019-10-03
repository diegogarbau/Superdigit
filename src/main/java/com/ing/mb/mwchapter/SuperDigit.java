package com.ing.mb.mwchapter;

@FunctionalInterface
public interface SuperDigit {

  /**
   * @param n String representation of the initial number
   * @param k Number repetitions on 'n' for calculation of the super-digit
   * @return the super-digit of the number P (result of n repeated k times)
   */
  int calc(String n, String k);
}
