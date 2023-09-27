package com.ppojin.leetcode.leetcode75;

//880. Decoded String at Index
public class Solution880 {
    public String decodeAtIndex(String s, int k) {
        int len = 0;
        int i = 0;

        while (len < k) {
            if (Character.isDigit(s.charAt(i))) {
                len *= (s.charAt(i) - '0');
            } else {
                len++;
            }
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            if (Character.isDigit(s.charAt(j))) {
                len /= (s.charAt(j) - '0');
                k %= len;
            } else {
                if (k == 0 || k == len) {
                    return Character.toString(s.charAt(j));
                }
                len--;
            }
        }

        return "";
    }
}
