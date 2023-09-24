package com.java.java_8;

@FunctionalInterface
public interface AnnotatedFuntionalIntf {

    void doTest();

    //if we are using @FunctionalInterface we cannot define more than one abstract method in interface .
    // @FunctionalInterface is optional , it is introduced to avoid creating more than one abstract method in
    // functional interface

    //void doTestAgain();
}
