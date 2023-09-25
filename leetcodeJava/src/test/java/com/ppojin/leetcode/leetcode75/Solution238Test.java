package com.ppojin.leetcode.leetcode75;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution238Test {

    private final Solution238 solution;

    public Solution238Test() {
        this.solution = new Solution238();
    }

    @Test
    void ex1() {
        assertArrayEquals(
                new int[]{24, 12, 8, 6},
                solution.productExceptSelf(new int[]{1, 2, 3, 4})
        );
    }

    @Test
    void ex2() {
        assertArrayEquals(
                new int[]{0, 0, 9, 0, 0},
                solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3})
        );
    }
}