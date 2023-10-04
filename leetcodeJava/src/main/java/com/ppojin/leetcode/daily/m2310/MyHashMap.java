package com.ppojin.leetcode.daily.m2310;

import java.util.HashMap;

// 706. Design HashMap
public class MyHashMap extends HashMap<Integer, Integer> {
    public MyHashMap() {
        super();
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }
}
