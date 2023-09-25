package com.ppojin.leetcode.leetcode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 238. Product of Array Except Self
// https://leetcode.com/problems/product-of-array-except-self
public class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        List<Integer> zero = new ArrayList<>();
        int i = 0;
        int mul = 1;
        for (var n : nums) {
            if (n == 0) zero.add(i);
            else mul *= n;
            i++;
        }
        if(zero.isEmpty()){
            int finalMul = mul;
            return Arrays.stream(nums)
                    .map(n -> (Math.floorDiv(finalMul, n)))
                    .toArray();
        } else {
            int[] result = new int[nums.length];
            Arrays.fill(result, 0);
            if (zero.size() == 1) result[zero.get(0)] = mul;
            return result;
        }
    }
}
