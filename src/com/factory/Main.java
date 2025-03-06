package com.factory;

public class Main {

    public static void main(String[] args) {
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery("Phnom penh");

        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery("Takeo");
    }
}
