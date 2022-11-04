package com.leetcode.yerassylaitkazy.squareeverydigit;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareDigit {

  private static final String DELIMITER = "";

  public int squareDigits(int number) {
    return Integer.parseInt(getDoubledDigitsString(number));
  }

  private String getDoubledDigitsString(int number) {
    return getStreamOfDigits(number)
      .map(this::squareNumber)
      .map(String::valueOf)
      .collect(Collectors.joining(DELIMITER));
  }

  private Stream<Integer> getStreamOfDigits(int number) {
    return Arrays.stream(String.valueOf(number).split(DELIMITER)).map(Integer::parseInt);
  }

  private int squareNumber(int number) {
    return number * number;
  }
}
