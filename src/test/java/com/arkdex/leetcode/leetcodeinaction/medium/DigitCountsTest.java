package com.arkdex.leetcode.leetcodeinaction.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DigitCountsTest {
    @Test
    public void testDigitCounts() {
        Assertions.assertTrue(DigitCounts.digitCounts(0, 19) == 2);
        Assertions.assertTrue(DigitCounts.digitCounts(0, 9) == 1);
        Assertions.assertTrue(DigitCounts.digitCounts(0, 100) == 12);
        Assertions.assertTrue(DigitCounts.digitCounts(0, 0) == 1);
        Assertions.assertTrue(DigitCounts.digitCounts(1, 12) == 5);
        Assertions.assertTrue(DigitCounts.digitCounts(1, 302) == 161);
        Assertions.assertTrue(DigitCounts.digitCounts(2, 2000) == 601);
        Assertions.assertTrue(DigitCounts.digitCounts(9, 9999) == 4000);
    }
}
