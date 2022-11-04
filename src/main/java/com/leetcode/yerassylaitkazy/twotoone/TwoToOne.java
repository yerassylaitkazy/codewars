package com.leetcode.yerassylaitkazy.twotoone;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoToOne {

  private static final String DELIMITER = "";

  public static String longest(String word1, String word2) {
    return Arrays.stream((word1+word2)
      .split(DELIMITER))
      .distinct()
      .sorted()
      .collect(Collectors.joining(DELIMITER));
  }
}
