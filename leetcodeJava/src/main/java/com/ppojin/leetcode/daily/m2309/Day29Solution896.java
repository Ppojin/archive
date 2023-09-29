package com.ppojin.leetcode.daily.m2309;

// 896. Monotonic Array
// https://leetcode.com/problems/monotonic-array
public class Day29Solution896 {
    public boolean isMonotonic(int[] nums) {
        if (nums.length < 2) return true;
        Boolean first = null;
        for (var i = 1; i < nums.length; i++) {
            var diff = nums[i] - nums[i - 1];
            if (first == null) {
                if (diff != 0)
                    first = diff > 0;
            } else {
                if ((diff != 0) && !first.equals(diff > 0))
                    return false;
            }
        }
        return true;
    }
}
