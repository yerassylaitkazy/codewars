package com.leetcode.yerassylaitkazy.jadencase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JadenCaseTest {

  private JadenCase jadenCase;

  @BeforeEach
  void setUp() {
    this.jadenCase = new JadenCase();
  }

  @Test
  public void toJadenCase_shouldReturnValidString_whenNonEmptyStringPassed() {
    assertEquals("Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
  }

  @Test
  public void toJadenCase_shouldReturnValidString_whenNonEmptyStringWithMultipleSpacePassed() {
    assertEquals("Most     Trees Are Blue", jadenCase.toJadenCase("most     trees are blue"));
  }

  @Test
  public void toJadenCase_shouldReturnNull_whenNullPassed() {
    assertNull(jadenCase.toJadenCase(null));
  }

  @Test
  public void toJadenCase_shouldReturnNull_whenEmptyStringPassed() {
    assertNull(jadenCase.toJadenCase(""));
  }
}
