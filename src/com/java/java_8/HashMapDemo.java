package com.java.java_8;

import com.java.java_8.ds.list.demo.Student;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        // key -> value
        // keys are always unique
        // if u use same key twice , value will be replaced by the later
        // print ordering may or may not be always same
        Map<Integer, String> newMap = new HashMap<>();

        newMap.put(1,"std1");
        newMap.put(2,"std2");
        newMap.put(3,"std3");
        newMap.put(4,"std4");
        newMap.put(1,"std5");

        newMap.forEach((k, v)-> System.out.println("key:"+ k + " Value:"+ v));


        Map<Integer, Student> studentMap = new HashMap<>();

        studentMap.put(1, new Student("std1", 11, 12));
    }
}
