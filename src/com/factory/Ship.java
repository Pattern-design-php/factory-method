package com.factory;

public class Ship implements Transport{

    public Transport delivery(){
        System.out.println("Hi");
        return this;
    }
}
