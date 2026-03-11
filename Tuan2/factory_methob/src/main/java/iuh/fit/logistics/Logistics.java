package iuh.fit.logistics;


import iuh.fit.transport.Transport;

public abstract class Logistics {

    public void planDelivery() {

        Transport transport = createTransport();

        transport.deliver();
    }

    public abstract Transport createTransport();
}