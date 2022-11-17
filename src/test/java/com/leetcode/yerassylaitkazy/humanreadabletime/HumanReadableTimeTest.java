package com.leetcode.yerassylaitkazy.humanreadabletime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanReadableTimeTest {

  @Test
  void makeReadable_test1() {
    assertEquals("00:00:00", HumanReadableTime.makeReadable(0));
  }

  @Test
  void makeReadable_test2() {
    assertEquals("00:00:05", HumanReadableTime.makeReadable(5));
  }

  @Test
  void makeReadable_test3() {
    assertEquals("00:01:00", HumanReadableTime.makeReadable(60));
  }

  @Test
  void makeReadable_test4() {
    assertEquals("23:59:59", HumanReadableTime.makeReadable(86399));
  }

  @Test
  void makeReadable_test5() {
    assertEquals("99:59:59", HumanReadableTime.makeReadable(359999));
  }
}
