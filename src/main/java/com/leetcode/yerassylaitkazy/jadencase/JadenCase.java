package com.leetcode.yerassylaitkazy.jadencase;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

  private static final String DELIMITER = " ";

  public String toJadenCase(String phrase) {
    if (isEmptyOrNull(phrase)) {
      return null;
    }

    return capitalizeWords(phrase);
  }

  private boolean isEmptyOrNull(String sequence) {
    return sequence == null || sequence.isEmpty();
  }

  private String capitalizeWords(String sentence) {
    return Arrays.stream(sentence
        .split(DELIMITER))
      .map(this::capitalizeWord)
      .collect(Collectors.joining(DELIMITER));
  }

  private String capitalizeWord(String word) {
    if (isEmptyOrNull(word)) {
      return word;
    }

    return word.substring(0,1).toUpperCase() + word.substring(1);
  }
}
