package com.ppojin.leetcode.leetcode75;

//880. Decoded String at Index
public class Solution880 {
    public String decodeAtIndex(String s, int k) {
        long len = 0;
        int i = 0;

        while (len < k) {
            if (Character.isDigit(s.charAt(i))) {
                len *= (s.charAt(i) - '0');
            } else {
                len++;
            }
            i++;
        }

        System.out.printf("len = %d, i=%d\n", len, i);
        for (int j = i - 1; j >= 0; j--) {
            char c = s.charAt(j);
            if (Character.isDigit(c)) {
                len = len / (c - '0');
                k = (int) (k % len);
            } else {
                if (k == 0 || k == len) {
                    return Character.toString(c);
                }
                len--;
            }
        }
        return "";
    }
}
