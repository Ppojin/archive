package com.ppojin.leetcode.daily.m2309;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Stream;

// 905. Sort Array By Parity
// https://leetcode.com/problems/sort-array-by-parity
public class Day28Solution905 {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0, end = nums.length - 1;
        int temp;

        while (start < end) {
            while (start < end && nums[start] % 2 == 0)
                start++;
            while (start < end && nums[end] % 2 == 1)
                end--;

            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }

        return nums;
    }

//    public int[] sortArrayByParity(int[] nums) {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//
//        for (var n : nums){
//            if(n % 2 == 0){
//                linkedList.addFirst(n);
//            } else {
//                linkedList.addLast(n);
//            }
//        }
//
//        return linkedList.stream()
//                .mapToInt(v->v)
//                .toArray();
//    }

//    public int[] sortArrayByParity(int[] nums) {
//        return Arrays.stream(nums)
//                .mapToObj(v->(Integer) v)
//                .sorted(Comparator.comparing((x)-> x % 2 == 0))
//                .mapToInt(v->v)
//                .toArray();
//    }
}
