package com.factory;

public class Truck implements Transport{

    public Transport delivery(){
        System.out.println("Hi");
        return this;
    }
}
