package com.java.interfaces;

// abstract class is a class which has at least one abstract method.
// if we are defining abstract method in a class then the class has to be abstract
public abstract class AbstractDemo {

    // unlike interface abstract method in abstract class can be non public ie. default , protected but not private
    protected abstract void printDemo();

    public void doSomething() {

    }
}
