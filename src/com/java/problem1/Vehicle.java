package com.java.problem1;

public class Vehicle {

    public final NavStrategy navStrategy; // HAS-A

    // dependency injection
    public Vehicle(NavStrategy navStrategy) {
        this.navStrategy = navStrategy;
    }

    public void navigate() {
        navStrategy.compute();
    }
}
