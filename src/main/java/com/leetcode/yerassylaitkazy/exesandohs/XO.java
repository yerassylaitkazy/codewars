package com.leetcode.yerassylaitkazy.exesandohs;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class XO {

  public static boolean getXO (String str) {
    return isXOEqualCount(getCharacterCount(str));
  }

  private static Map<Character, Long> getCharacterCount(String sentence) {
    return sentence
      .toLowerCase()
      .chars()
      .mapToObj(c -> (char) c)
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }

  private static boolean isXOEqualCount(Map<Character, Long> characterCount) {
    return characterCount
      .getOrDefault('x', 0L)
      .equals(characterCount.getOrDefault('o', 0L));
  }
}
