package com.ppojin.leetcode.dailyquestion;

import com.ppojin.leetcode.dailyquestion.Solution316;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution316Test {
    Solution316 solution = new Solution316();

    @Test
    void ex1(){
        assertEquals(solution.removeDuplicateLetters("bcabc"), "abc");
    }
    @Test
    void ex2(){
        assertEquals(solution.removeDuplicateLetters("cbacdcbc"), "acdb");
    }
}