package com.ppojin.leetcode.leetcode75;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution334Test {
    Solution334 solution = new Solution334();

    @Test
    void ex1() {
        assertEquals(true, solution.increasingTriplet(
                new int[]{1, 2, 3, 4, 5}
        ));
    }

    @Test
    void ex2() {
        assertEquals(false, solution.increasingTriplet(
                new int[]{5, 4, 3, 2, 1}
        ));
    }

    @Test
    void ex3() {
        assertEquals(true, solution.increasingTriplet(
                new int[]{2, 1, 5, 0, 4, 6}
        ));
    }

    @Test
    void ex66() {
        assertEquals(true, solution.increasingTriplet(
                new int[]{20, 100, 10, 12, 5, 13}
        ));
    }

    @Test
    void ex76() {
        assertEquals(true, solution.increasingTriplet(
                new int[]{1, 6, 2, 5, 1}
        ));
    }

    @Test
    void ex82() {
        assertEquals(false, solution.increasingTriplet(
                new int[]{1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,-1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0}
        ));
    }

    @Test
    void exCustom() {
        assertEquals(false, solution.increasingTriplet(
                new int[]{3,4,2,3}
        ));
    }
}