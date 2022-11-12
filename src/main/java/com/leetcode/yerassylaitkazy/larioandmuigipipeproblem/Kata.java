package com.leetcode.yerassylaitkazy.larioandmuigipipeproblem;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Kata {

  public static int[] pipeFix(int[] numbers) {
    return IntStream.range(minOf(numbers), maxOf(numbers) + 1).toArray();
  }

  private static int maxOf(int[] numbers) {
    return Arrays.stream(numbers).max().orElseThrow(NoSuchElementException::new);
  }

  private static int minOf(int[] numbers) {
    return Arrays.stream(numbers).min().orElseThrow(NoSuchElementException::new);
  }
}
