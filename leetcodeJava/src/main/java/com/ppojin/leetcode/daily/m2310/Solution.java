package com.ppojin.leetcode.daily.m2310;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    /*
    Day 6
    343. Integer Break
    */
    public int integerBreak(int n) {
        if (n == 2) return 1;
        else if (n == 3) return 2;
        else if (n == 4) return 4;

        int p = n / 3;
        int l = n % 3;
        if (l == 1) {
            p -= 1;
            l += 3;
        }
        return ((int) Math.pow(3, p)) * (l == 0 ? 1 : l);
    }

    /*
    Day 5
    229. Majority Element II
    */
    public List<Integer> majorityElement(int[] nums) {
        // hint: length of result could not bigger then 2
        int n0 = 0x7fffffff;
        int n1 = 0x80000000;
        int c0 = 0;
        int c1 = 0;

        for (int n : nums) {
            if (n0 == n) c0++;
            else if (n1 == n) c1++;
            else if (c0 == 0) {
                n0 = n;
                c0 = 1;
            } else if (c1 == 0) {
                n1 = n;
                c1 = 1;
            } else {
                c0--;
                c1--;
            }
        }

        c0 = 0;
        c1 = 0;
        for (int n : nums) {
            if (n0 == n) c0++;
            if (n1 == n) c1++;
        }
        System.out.printf("%d %d", c0, c1);

        if (c1 > nums.length / 3 && c0 > nums.length / 3) {
            return List.of(n0, n1);
        } else if (c0 > nums.length / 3) {
            return List.of(n0);
        } else if (c1 > nums.length / 3) {
            return List.of(n1);
        } else {
            return List.of();
        }

//        List<Integer> result = new ArrayList<>();
//        int[] array = Arrays.stream(nums).sorted().toArray();
//        int past = array[0];
//        int count = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (past == array[i]) {
//                count += 1;
//            } else {
//                if (count > less) {
//                    result.add(past);
//                }
//                past = array[i];
//                count = 1;
//            }
//        }
//        if (count > less && !result.contains(past)) {
//            result.add(past);
//        }
//        return result;
    }

    /*
    Day 3
    1512. Number of Good Pairs
    */
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i : nums) {
            numMap.put(i, numMap.getOrDefault(i, 0) + 1);
        }

        return numMap.values().stream()
                .filter(n -> n >= 2)
                .mapToInt(n -> n * (n - 1) / 2)
                .sum();
    }

    /*
     * Day 2
     * 2038. Remove Colored Pieces if Both Neighbors are the Same Color
     * */
    public boolean winnerOfGame(String colors) {
        char past = colors.charAt(0);
        int count = 1;
        Map<Character, Integer> score = new HashMap<>();
        score.put('A', 0);
        score.put('B', 0);

        for (int i = 1; i < colors.length(); i++) {
            char curr = colors.charAt(i);
            if (curr == past) {
                count++;
                if (count >= 3) {
                    score.put(curr, score.get(curr) + 1);
                }
            } else {
                count = 1;
                past = curr;
            }
            System.out.printf("curr:%c past:%c count:%d A:%d b:%d\n",
                    curr, past,
                    count,
                    score.get('A'),
                    score.get('A')
            );
        }
        return score.get('A') > score.get('B');
    }

    /*
        Day1
        557. Reverse Words in a String III
    */
    public String reverseWords(String s) {
        return Arrays.stream(s.split(" "))
                .map((String w) -> {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < w.length(); i++) {
                        sb.append(w.charAt(w.length() - i - 1));
                    }
                    return sb.toString();
                })
                .collect(Collectors.joining(" "));
    }
}
