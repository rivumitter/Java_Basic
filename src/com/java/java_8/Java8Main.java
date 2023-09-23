package com.java.java_8;

public class Java8Main {
    public static void main(String[] args) {

        // lambda expression
        // is an implementation of an abstract method of the functional interface
        DemoFuncIntf demoFuncIntf = () -> {
            System.out.println("calling demoCall from lambda");
        };

        DemoFuncIntf demoFuncIntfTwo = () -> {
            System.out.println("calling demoCall from lambda two");
        };

        demoFuncIntfTwo.demoCall();


        //

        DemoFuncIntf demoFuncIntfOfClass = new DemoClass();
       // demoFuncIntfOfClass.demoCall();


    }
}
