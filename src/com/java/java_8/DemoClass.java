package com.java.java_8;

public class DemoClass implements DemoFuncIntf {

    @Override
    public int demoCall(int a) {
        System.out.println("demo class");
        return 10;
    }
}
