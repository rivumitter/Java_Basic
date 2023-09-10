package com.java.interfaces;

// is a contract and we cannot create object of an interface but we can use dynamic polymorphism to create a type
public interface Engine {
    int p = 0; // every variable inside interface is public static final

    // any implementing class of an interface are bound to override abstract methods
    void start(); // any method definition inside an interface is public abstract
    void stop(); // any method definition inside an interface is public abstract

    // to have backward compatibility , without breaking implementing class we are adding functionality
    default void antiLockBreakingSystem() {
        System.out.println("default antiLockBreakingSystem");
    }
}
