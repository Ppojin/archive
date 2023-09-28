package com.ppojin.leetcode.daily.m2309;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day26Solution316Test {
    Day26Solution316 solution = new Day26Solution316();

    @Test
    void ex1(){
        assertEquals(solution.removeDuplicateLetters("bcabc"), "abc");
    }
    @Test
    void ex2(){
        assertEquals(solution.removeDuplicateLetters("cbacdcbc"), "acdb");
    }
}