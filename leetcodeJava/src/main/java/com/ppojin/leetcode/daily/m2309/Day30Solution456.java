package com.ppojin.leetcode.daily.m2309;

import java.util.Arrays;
import java.util.Stack;

public class Day30Solution456 {
    public boolean find132pattern(int[] nums) {
        var leftMin = Integer.MAX_VALUE;
        int[] lefts = new int[nums.length];
        Arrays.fill(lefts, Integer.MIN_VALUE);

        for (int i = 0; i < nums.length; i++){
            leftMin = Math.min(nums[i], leftMin);
            lefts[i] = leftMin;
        }

        Stack<Integer> rights = new Stack<>();
        for (int j = nums.length - 1; j >= 1 ; j--){
            if(nums[j] > lefts[j]){
                while((!rights.isEmpty()) && (rights.peek() <= lefts[j])){
                    rights.pop();
                }
                if((!rights.isEmpty()) && (rights.peek() < nums[j])){
                    return true;
                }
                rights.add(nums[j]);
            }
        }
        return false;

//        for (int j = 1; j < nums.length-1 ; j++){
//            int i = j-1;
//            if (nums[j] > lefts[i]){
//                for (int k = j+1 ; k < nums.length ; k++){
//                    if(nums[j] > nums[k] && nums[k] > lefts[i]){
//                        return true;
//                    }
//                }
//            }
//        }
//
//        return false;
    }

//    public boolean find132pattern(int[] nums) {
//        var leftMin = Integer.MAX_VALUE;
//        var rightMin = Integer.MAX_VALUE;
//        int[] lefts = new int[nums.length];
//        int[] rights = new int[nums.length];
//        Arrays.fill(lefts, Integer.MIN_VALUE);
//        Arrays.fill(rights, Integer.MAX_VALUE);
//
//        for (int i = 0; i < nums.length; i++){
//            leftMin = Math.min(nums[i], leftMin);
//            lefts[i] = leftMin;
//
//            rightMin = Math.min(nums[nums.length - i - 1], rightMin);
//            rights[nums.length - i - 1] = rightMin;
//        }
//
//        for (int j = 1; j < nums.length-1 ; j++){
//            int i = j-1;
//            if (nums[j] > lefts[i] && nums[j] > rights[j+1]){
//                if (rights[j+1] > lefts[i]) {
//                    return true;
//                }
//                for (int k = j+1 ; k < nums.length ; k++){
//                    if(nums[j] > nums[k] && nums[k] > lefts[i]){
//                        return true;
//                    }
//                }
//            }
//        }
//
//        return false;
//    }

//    public boolean find132pattern(int[] nums) {
//        int n = nums[0];
//        int i = 0;
//        for (int j = 1; j < nums.length - 2; j++) {
//            for (int k = j + 1 ; k < nums.length-1 ; ) {
//
//            }
//            if (n < nums[j]) {
//                n = nums[j];
//            }
//        }
//    }

//    public boolean find132pattern(int[] nums) {
//        for (int i = 0 ; i < nums.length - 2 ; i++){
//            for (int j = i+1 ; j < nums.length - 1 ; j++){
//                if(nums[j] > nums[i]) {
//                    for (int k = j + 1; k < nums.length; k++) {
//                        if (nums[j] > nums[k] && nums[k] > nums[i])
//                            return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
}
