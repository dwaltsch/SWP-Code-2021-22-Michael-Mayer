package com.smortify.michael.projekte.oop.remote;

import com.smortify.michael.projekte.oop.remote.battery.Battery;

public class Remote {
    private boolean isOn;
    private boolean hasPower;
    private Battery battery1;
    private Battery battery2;

    public Remote(boolean isOn, boolean hasPower, Battery battery1, Battery battery2) {
        this.isOn = isOn;
        this.hasPower = hasPower;
        this.battery1 = battery1;
        this.battery2 = battery2;
    }

    public void turnOn(){
        battery1.setChargingStatus(battery1.getChargingStatus()-5);
        battery2.setChargingStatus(battery2.getChargingStatus()-5);
        battery1.turnonstatus();
        battery2.turnonstatus();
    }
    public void turnOff(){
        battery1.turnoffstatus();
        battery2.turnoffstatus();
    }
    public int getStatus(){
        int status = battery1.getChargingStatus() + battery2.getChargingStatus();
        return status;
    }

}
