package com.ppojin.leetcode.leetcode75;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Solution880Test {
    Solution880 solution = new Solution880();

    @ParameterizedTest
    @CsvSource(value = {
//            "leet2code3|10|o",
//            "ha22|5|h",
//            "ha22aa22|6|a",
            "a2345678999999999999999|256|a"
    }, delimiter = '|')
    void ex1(String s, int k, String result){
        assertEquals(result, solution.decodeAtIndex(s, k));
    }
}