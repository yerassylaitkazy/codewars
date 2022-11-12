package com.leetcode.yerassylaitkazy.bitcounting;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BitCounting {

  public static int countBits(int n){
    return Math.toIntExact(getCharacterCount(asBinaryString(n)).getOrDefault('1',0L));
  }

  private static String asBinaryString(int n) {
    return Integer.toBinaryString(n);
  }

  private static Map<Character, Long> getCharacterCount(String binaryString) {
    return binaryString
      .chars()
      .mapToObj(c -> (char) c)
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }
}
