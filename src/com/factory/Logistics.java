package com.factory;

public abstract class Logistics {
    // Factory Method
    public abstract Transport createTransport();

    public void planDelivery(String destination) {
        Transport transport = createTransport();
        transport.deliver(destination);
    }
}
