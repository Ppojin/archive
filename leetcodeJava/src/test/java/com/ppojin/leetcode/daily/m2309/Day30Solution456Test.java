package com.ppojin.leetcode.daily.m2309;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day30Solution456Test {
    Day30Solution456 solution = new Day30Solution456();

    @Test
//    @Disabled
    void find132pattern1() {
        int[] nums = new int[]{1, 2, 3, 4};
        assertEquals(false,
                solution.find132pattern(nums)
        );
    }
    @Test
    void find132pattern2() {
        int[] nums = new int[]{3,1,4,2};
        assertEquals(true,
                solution.find132pattern(nums)
        );
    }
    @Test
//    @Disabled
    void find132pattern3() {
        int[] nums = new int[]{-1,3,2,0};
        assertEquals(true,
                solution.find132pattern(nums)
        );
    }
    @Test
//    @Disabled
    void find132pattern4() {
        int[] nums = new int[]{1,0,1,-4,-3};
        assertEquals(false,
                solution.find132pattern(nums)
        );
    }
    @Test
//    @Disabled
    void find132pattern88() {
        int[] nums = new int[]{3,5,0,3,4};
        assertEquals(true,
                solution.find132pattern(nums)
        );
    }
}