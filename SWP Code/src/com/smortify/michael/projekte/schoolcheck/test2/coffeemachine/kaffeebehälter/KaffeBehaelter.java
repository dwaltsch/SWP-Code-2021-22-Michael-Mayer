package com.smortify.michael.projekte.schoolcheck.test2.coffeemachine.kaffeebehälter;

public class KaffeBehaelter {
    private int maxamount;
    private int coffeeamount;

    public KaffeBehaelter(int coffeeamount, int maxamount) {
        this.coffeeamount = coffeeamount;
        this.maxamount = maxamount;
    }

    public void refillCoffee() {
        this.coffeeamount = this.maxamount;
    }

    public int getCoffeeamount() {
        return coffeeamount;
    }

    public void setCoffeeamount(int coffeeamount) {
        this.coffeeamount = coffeeamount;
    }
}
