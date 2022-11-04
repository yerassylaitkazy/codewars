package com.leetcode.yerassylaitkazy.squareeverydigit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareDigitTest {

  SquareDigit squareDigit;

  @BeforeEach
  void setUp() {
    this.squareDigit = new SquareDigit();
  }

  @Test
  void squareDigits_shouldReturn0_when0Passed () {
    int expected = 0;

    int actual = squareDigit.squareDigits(0);

    assertEquals(expected, actual);
  }

  @Test
  void squareDigits_shouldReturn1_when1Passed() {
    int expected = 1;

    int actual = squareDigit.squareDigits(1);

    assertEquals(expected, actual);
  }

  @Test
  void squareDigits_shouldReturn10_when10Passed() {
    int expected = 10;

    int actual = squareDigit.squareDigits(10);

    assertEquals(expected, actual);
  }

  @Test
  void squareDigits_shouldReturn8181_when99Passed() {
    int expected = 8181;

    int actual = squareDigit.squareDigits(99);

    assertEquals(expected, actual);
  }

  @Test
  void squareDigits_shouldReturn64064_when808Passed() {
    int expected = 64064;

    int actual = squareDigit.squareDigits(808);

    assertEquals(expected, actual);
  }
}
