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
            "leet2code3|10|o",
            "ha22|5|h",
            "a2345678999999999999999|256|a",
            /* case 43 (len = 5736879408, i=58) (len > Integer.MAX_VALUE) */
            "czjkk9elaqwiz7s6kgvl4gjixan3ky7jfdg3kyop3husw3fm289thisef8blt7a7zr5v5lhxqpntenvxnmlq7l34ay3jaayikjps|768077956|c",
    }, delimiter = '|')
    void ex1(String s, int k, String result){
        assertEquals(result, solution.decodeAtIndex(s, k));
    }
}