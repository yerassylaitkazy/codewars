package com.leetcode.yerassylaitkazy.bitcounting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitCountingTest {

  @Test
  void countBits0() {
    assertEquals(5, BitCounting.countBits(1234));
  }

  @Test
  void countBits1() {
    assertEquals(1, BitCounting.countBits(4));
  }

  @Test
  void countBits2() {
    assertEquals(3, BitCounting.countBits(7));
  }

  @Test
  void countBits3() {
    assertEquals(2, BitCounting.countBits(9));
  }

  @Test
  void countBits4() {
    assertEquals(2, BitCounting.countBits(10));
  }
}
