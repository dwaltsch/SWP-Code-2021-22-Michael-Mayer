package com.smortify.michael.projekte.schoolcheck.test2.coffeemachine.Wassertank;

public class Wassertank {
    private int fillamount;
    private int maxamount;

    public Wassertank(int fillamount, int maxamount) {
        this.fillamount = fillamount;
        this.maxamount = maxamount;
    }

    public void refillTank() {
        this.fillamount = maxamount;
    }

    public int getFillamount() {
        return fillamount;
    }

    public void setFillamount(int fillamount) {
        this.fillamount = fillamount;
    }
}
