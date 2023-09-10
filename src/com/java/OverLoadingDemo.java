package com.java;

public class OverLoadingDemo {

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public int addNumbers(int a, int b, int c) {
        return a + b +c;
    }

    // Overloading is not dependent on return type of the method .
    // it only depends on : 1. number of param , type of param, arrangement of type of param.
    /*
    public double addNumbers(int a, int b, int c) {
        return a + b + c;
    }

     */

    public float addNumbers(int a, float b, int c) {
        return a + b + c;
    }

    public float addNumbers(int a, int b, float c) {
        return a + b + c;
    }
}
