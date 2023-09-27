package com.ppojin.leetcode.contest;

import java.util.HashMap;

public class Week291 {
    // 2259.
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

    // 2260.
    public int minimumCardPickup(int[] cards) {
        int minimum = Integer.MAX_VALUE;
        HashMap<Integer, Integer> cardSet = new HashMap<>();
        for (var i = 0; i < cards.length; i++) {
            if (cardSet.containsKey(cards[i])
                    && i - cardSet.get(cards[i]) + 1 < minimum) {
                minimum = i - cardSet.get(cards[i]) + 1;
            }
            cardSet.put(cards[i], i);
        }
        return minimum == Integer.MAX_VALUE ? -1 : minimum;
    }

    // 2261. K Divisible Elements Subarrays
    public int countDistinct(int[] nums, int k, int p) {
        return 0;
    }
}
