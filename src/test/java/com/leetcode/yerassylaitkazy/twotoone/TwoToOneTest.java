package com.leetcode.yerassylaitkazy.twotoone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoToOneTest {

  @Test
  void longest_shouldReturnValidString_whenBothEmptyPassed() {
    String expected = "";

    String actual = TwoToOne.longest("", "");

    assertEquals(expected, actual);
  }

  @Test
  void longest_shouldReturnValidString_FirstEmptyPassed() {
    String expected = "a";

    String actual = TwoToOne.longest("a", "");

    assertEquals(expected, actual);
  }

  @Test
  void longest_shouldReturnValidString_SecondEmptyPassed() {
    String expected = "b";

    String actual = TwoToOne.longest("", "b");

    assertEquals(expected, actual);
  }

  @Test
  void longest_shouldReturnValidString_BothEqualOneLengthPassed() {
    String expected = "c";

    String actual = TwoToOne.longest("c", "c");

    assertEquals(expected, actual);
  }

  @Test
  void longest_shouldReturnValidString_BothDifferentOneLengthPassed() {
    String expected = "ab";

    String actual = TwoToOne.longest("a", "b");

    assertEquals(expected, actual);
  }

  @Test
  public void test() {
    System.out.println("longest Fixed Tests");
    assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
    assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
    assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));
  }
}
