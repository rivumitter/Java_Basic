package com.java.interfaces;

public class InterfaceMain {

    public static void main(String[] args) {
        Engine engine;

        int value = 1;

        if(value == 1) {
            engine = new CarEngine();
            engine.start();
            engine.stop();
            ((CarEngine) engine).cooling();

        }
        else if (value == 2){
            engine = new TruckEngine();
            engine.start();
            engine.stop();
        }




    }
}
