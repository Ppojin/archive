package com.ppojin.leetcode.daily.m2309;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Day29Solution896Test {
    Day29Solution896 solution = new Day29Solution896();

    @CsvSource(value = {
            "1,2,2,3|true",
            "6,5,4,4|true",
            "1,3,2|false"
    }, delimiter = '|')
    @ParameterizedTest
    void isMonotonic(String nums, boolean output) {
        int[] array = Arrays.stream(nums.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        assertEquals(output,
                solution.isMonotonic(array)
        );
    }
}