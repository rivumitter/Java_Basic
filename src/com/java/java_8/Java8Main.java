package com.java.java_8;

public class Java8Main {
    public static void main(String[] args) {

        // lambda expression
        // is an implementation of an abstract method of the functional interface
        DemoFuncIntf demoFuncIntf = a -> 11;

        DemoFuncIntf demoFuncIntfTwo = (a) -> 12;

        int i = demoFuncIntfTwo.demoCall(5);

        System.out.println(i);


        //

        DemoFuncIntf demoFuncIntfOfClass = new DemoClass();
       // demoFuncIntfOfClass.demoCall();


    }
}
