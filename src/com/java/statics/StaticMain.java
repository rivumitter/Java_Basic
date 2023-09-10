package com.java.statics;

public class StaticMain {
    public static void main(String[] args) {
        StaticImpl.printStatic();

        //its not required
        StaticImpl aStatic = new StaticImpl();
        aStatic.printStatic();



    }
}

