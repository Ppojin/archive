package com.ppojin.leetcode.daily.m2310;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

    /*
    Day 3
    1512. Number of Good Pairs
    */
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for(int i : nums){
            numMap.put(i, numMap.getOrDefault(i, 0) + 1);
        }

        return numMap.values().stream()
                .filter(n -> n>=2)
                .mapToInt(n -> n*(n-1)/2)
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

        for (int i = 1 ; i < colors.length() ; i++){
            char curr = colors.charAt(i);
            if (curr == past){
                count++;
                if(count >= 3){
                    score.put(curr, score.get(curr)+1);
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
                    for(int i = 0 ; i < w.length() ; i++){
                        sb.append(w.charAt(w.length() - i - 1));
                    }
                    return sb.toString();
                })
                .collect(Collectors.joining(" "));
    }
}
