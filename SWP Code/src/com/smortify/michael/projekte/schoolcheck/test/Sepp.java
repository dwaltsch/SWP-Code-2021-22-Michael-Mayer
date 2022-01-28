package com.smortify.michael.projekte.schoolcheck.test;

public class Sepp {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        LightElement lightElement1 = new LightElement("SmortLamp", "kinda grey", 5);
        LightElement lightElement2 = new LightElement("Smortleaf", "snow white", 15);
        lamp.addLightElement(lightElement1);
        lamp.addLightElement(lightElement2);
        lightElement1.turnOff();
        lightElement1.turnOn();
        lamp.turnAllOn();
        lamp.getOverallPowerusage();
        lamp.printNamesofLightElements();
    }
}

// todo bug fixen das se sich einschaltet
