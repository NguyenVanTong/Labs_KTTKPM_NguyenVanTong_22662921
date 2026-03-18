package iuh.fit;

import iuh.fit.logistics.Logistics;
import iuh.fit.logistics.RoadLogistics;
import iuh.fit.logistics.SeaLogistics;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Logistics logistics;

        logistics = new RoadLogistics();
        logistics.planDelivery();

        logistics = new SeaLogistics();
        logistics.planDelivery();
    }
}