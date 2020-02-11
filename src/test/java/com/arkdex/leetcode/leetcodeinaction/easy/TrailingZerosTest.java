package com.arkdex.leetcode.leetcodeinaction.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TrailingZerosTest {
    @Test
    public void testZeros() {
        long count =TrailingZeros.doC(5555550000000L);
        Assertions.assertTrue(count == 1388887499996L);
    }
}
