package com.factory;

public class Ship implements Transport {

    @Override
    public void deliver(String name) {
        System.out.println(name);
    }
}
