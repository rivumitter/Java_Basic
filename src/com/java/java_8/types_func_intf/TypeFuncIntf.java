package com.java.java_8.types_func_intf;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TypeFuncIntf {
    public static void main(String[] args) {

        // this are 4 functional interfaces

        // Consumer<T> -> void accept(T t);

        Consumer<String> testConsumer = (value) -> System.out.println("test consumer called with value "+value);
        testConsumer.accept("arghya");

        // Supplier

        Supplier<Integer> testSupplier = () -> 15;

        Integer integer = testSupplier.get();

        System.out.println("testSupplier:"+ integer);


        // Predicate

        // it returns only boolean

        Predicate<Integer> testPredicate = val -> val > 10;

        boolean test = testPredicate.test(9);

        System.out.println("testPredicate:"+ test);


        // Function

        Function<Integer, String> testFuntion = val -> "testFunction value is:"+val;

        String apply = testFuntion.apply(10);

        System.out.println(apply);

    }
}
