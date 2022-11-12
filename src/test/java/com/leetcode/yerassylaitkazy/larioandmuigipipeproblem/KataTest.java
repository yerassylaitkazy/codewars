package com.leetcode.yerassylaitkazy.larioandmuigipipeproblem;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

  @Test
  void pipeFix_shouldThrowNoSuchElementException_whenEmptyArrayPassed() {
    assertThrows(NoSuchElementException.class, () -> Kata.pipeFix(new int[] {}));
  }

  @Test
  void pipeFix0() {
    assertArrayEquals(new int[] {1}, Kata.pipeFix(new int[] {1}));
  }

  @Test
  void pipeFix1() {
    assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, Kata.pipeFix(new int[] {1,2,3,5,6,8,9}));
  }

  @Test
  void pipeFix2() {
    assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, Kata.pipeFix(new int[] {1,2,3,12}));
  }

  @Test
  void pipeFix3() {
    assertArrayEquals(new int[] {6,7,8,9}, Kata.pipeFix(new int[] {6,9}));
  }

  @Test
  void pipeFix4() {
    assertArrayEquals(new int[] {-1,0,1,2,3,4}, Kata.pipeFix(new int[] {-1,4}));
  }

  @Test
  void pipeFix5() {
    assertArrayEquals(new int[] {1,2,3}, Kata.pipeFix(new int[] {1,2,3}));
  }
}
