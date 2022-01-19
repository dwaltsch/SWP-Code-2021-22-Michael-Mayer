package com.smortify.michael.projekte.oop.O10remote.battery;

public class Battery {
    private int chargingStatus;

    public Battery(int chargingStatus) {
        this.chargingStatus = chargingStatus;
    }

    public void turnonstatus() {
        System.out.println("Verbraucher angeschlossen");
    }

    public int getChargingStatus() {
        return chargingStatus;
    }

    public void setChargingStatus(int chargingStatus) {
        this.chargingStatus = chargingStatus;
    }

    public void turnoffstatus() {
        System.out.println("Kein Verbraucher angeschlossen");
        System.out.println(this.chargingStatus);
    }

}
