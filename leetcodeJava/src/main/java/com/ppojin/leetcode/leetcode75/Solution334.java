package com.ppojin.leetcode.leetcode75;

// 334. Increasing Triplet Subsequence
// https://leetcode.com/problems/increasing-triplet-subsequence
public class Solution334 {
    public boolean increasingTriplet(int[] nums) {
        int left = 0x7fffffff;
        int right = 0x7fffffff;
        for (int n : nums) {
            if (right < n) return true;
            else if (left < n && right > n) right = n;
            else if (left > n) left = n;
        }
        return false;
    }

//    public boolean increasingTriplet(int[] nums) {
//        int min = 0x7fffffff;
//        int left = 0x7fffffff;
//        int right = 0x7fffffff;
//        for (int n : nums) {
//            if (right < n) return true;
//            else if (min > n) min = n;
//            else if (min < n) {
//                if (left > n) {
//                    left = min;
//                    right = n;
//                }
//                else if (right > n) {
//                    right = n;
//                }
//            }
//        }
//        return false;
//    }

//    public boolean increasingTriplet(int[] nums) {
//        int min = 0x7fffffff;
//        int[] doublet = new int[]{0x7fffffff, 0x7fffffff};
//        for (int n : nums) {
//            if (doublet[1] < n) return true;
//            else if (min > n) min = n;
//            else if (min < n) {
//                if (doublet[0] > n) doublet = new int[]{min, n};
//                else if (doublet[1] > n) doublet = new int[]{doublet[0], n};
//            }
//        }
//        return false;
//    }
}
