package com.factory;

public class Truck implements Transport{
    @Override
    public void deliver(String name) {
        System.out.println(name);
    }
}
