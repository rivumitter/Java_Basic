package com.java.interfaces;

import com.java.statics.StaticImpl;

// a class can impelement multiple interfaces at same time
public class CarEngine implements Engine, AirCooler {

    static int p = 10;
    @Override
    public void start() {
        System.out.println("Car engine start");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stop");
    }

    @Override
    public void cooling() {
        System.out.println("Car air cooler");
    }
}
