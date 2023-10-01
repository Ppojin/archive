package com.ppojin.leetcode.daily.m2310;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

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
