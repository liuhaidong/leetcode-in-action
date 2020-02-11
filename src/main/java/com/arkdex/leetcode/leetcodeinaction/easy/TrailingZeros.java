package com.arkdex.leetcode.leetcodeinaction.easy;



public class TrailingZeros {

    public static Long doC(long n) {
        // write your code here, try to do it without arithmetic operators.
        long zeroCount = 0L;
        long num = 5L;
        while (num <= n) {
            zeroCount += n / num;
            num = num * 5;
        }
        return zeroCount;
    }

}
