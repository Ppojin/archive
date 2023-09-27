package com.ppojin.leetcode.leetcode75;

public class Solution2259 {
    public String removeDigit(String number, char digit) {
        StringBuilder sb = new StringBuilder(number);
        int lastDigitIndex = 0x7fffffff;
        for (var i = 0; i < number.length(); i++) {
            char n = number.charAt(i); // target
            if (n == digit) {
                if (i < number.length() - 1 && number.charAt(i + 1) > n) {
                    return sb.delete(i, i + 1).toString();
                }
                lastDigitIndex = i;
            }
        }

        if (lastDigitIndex != Integer.MAX_VALUE) {
            return sb.delete(lastDigitIndex, lastDigitIndex + 1).toString();
        } else {
            return number;
        }
    }
}
