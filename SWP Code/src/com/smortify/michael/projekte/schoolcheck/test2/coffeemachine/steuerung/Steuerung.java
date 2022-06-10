package com.smortify.michael.projekte.schoolcheck.test2.coffeemachine.steuerung;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Steuerung {
    private int staerke;
    private int kaffeegroesse;

    public Steuerung(int staerke, int kaffeegroesse) {
        this.staerke = staerke;
        this.kaffeegroesse = kaffeegroesse;
    }

    public void Hardwaredelay() throws InterruptedException {
        Random rand = new Random();
        TimeUnit.SECONDS.sleep(rand.nextInt(5)); // because the manufacturer cheaped out on the hardware there is a slight time delay between operation
    }

    public int getStaerke() {
        return staerke;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public int getKaffeegroesse() {
        return kaffeegroesse;
    }

    public void setKaffeegroesse(int kaffeegroesse) {
        this.kaffeegroesse = kaffeegroesse;
    }
}
