package com.smortify.michael.projekte.oop.O10remote;

import com.smortify.michael.projekte.oop.O10remote.battery.Battery;

public class Remote {
    private final Battery battery1;
    private final Battery battery2;
    private boolean isOn;
    private boolean hasPower;

    public Remote(Battery battery1, Battery battery2) {
        this.battery1 = battery1;
        this.battery2 = battery2;
    }

    public void turnOn() {
        battery1.setChargingStatus(battery1.getChargingStatus() - 5);
        battery2.setChargingStatus(battery2.getChargingStatus() - 5);
        battery1.turnonstatus();
        battery2.turnonstatus();
    }

    public void turnOff() {
        battery1.turnoffstatus();
        battery2.turnoffstatus();
    }

    public int getStatus() {
        int status = (battery1.getChargingStatus() + battery2.getChargingStatus()) / 2;
        System.out.println(status);
        return status;
    }

}
