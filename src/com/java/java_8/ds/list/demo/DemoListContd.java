package com.java.java_8.ds.list.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoListContd {

    public static void main(String[] args) {

        // ["apple" , "banana", "apple" , "grapes"]
        // apple -> 2 , banana - 1

        List<String> fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("apple");
        fruitList.add("grapes");

        Map<String, Integer> resultMap = new HashMap<>();

        for(String fruits:fruitList) {
            if(resultMap.containsKey(fruits)) {
                resultMap.put(fruits, resultMap.get(fruits) + 1);
            }
            else
                resultMap.put(fruits, 1);
        }


        // after java 8
        resultMap.forEach((k, v)-> System.out.println(k+"->"+v));

        // Collectors.groupingBy(Function<T, R>))

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("std1", 11, 6));
        studentList.add(new Student("std2", 12, 5));
        studentList.add(new Student("std3", 10, 6));
        studentList.add(new Student("std4", 21, 7));
        studentList.add(new Student("std5", 20, 7));


        Map<Integer, List<Student>> studentMap = studentList.stream()
                                                            .collect(Collectors.groupingBy(student -> student.getStandard()));

        System.out.println("---------------------");

        studentMap.forEach((k, v)-> System.out.println(k+"->"+v));

        System.out.println("======================");

        // Collectors.groupingBy(Function<T, R>, Collectors))

        System.out.println("---------------------------");
        Map<String, Long> occurenceMap = fruitList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Collectors.groupingBy(Function<T, R>, Supplier<P> , Collectors))
        occurenceMap.forEach((k, v)-> System.out.println(k+"->"+v));

    }
}
