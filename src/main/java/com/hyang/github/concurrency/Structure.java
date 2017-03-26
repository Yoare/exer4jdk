package com.hyang.github.concurrency;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by hyang on 2017/3/11.
 */
public class Structure {
    Map<String, String> test = new ConcurrentHashMap<>();




    public static void main(String[] args) {
        System.out.println("this is a test");
    }
}
