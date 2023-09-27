package com.ppojin.leetcode.leetcode75;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Solution2259Test {
    private static Solution2259 solution = new Solution2259();

    @ParameterizedTest
    @CsvSource(value = {
            "123|3|12",
            "1231|1|231",
            "551|5|51",
            "73197|7|7319",
            "133235|3|13325",
    }, delimiter = '|')
    void removeDigit(String number, char digit, String output) {
        assertEquals(output,
                solution.removeDigit(number, digit)
        );
    }
}