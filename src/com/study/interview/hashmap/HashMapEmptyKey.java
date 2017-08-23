package com.study.interview.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangyonghua on 2017/8/23.
 */
public class HashMapEmptyKey {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(null, null);
        map.put("name", "wangyonghua");
        System.out.println(map);
    }
}
