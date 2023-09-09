package com.java.interfaces;

public class TruckEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Truck engine start");
    }

    @Override
    public void stop() {
        System.out.println("Truck engine stop");
    }
}
