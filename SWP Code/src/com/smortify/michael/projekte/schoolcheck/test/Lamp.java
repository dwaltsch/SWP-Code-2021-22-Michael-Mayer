package com.smortify.michael.projekte.schoolcheck.test;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    List<LightElement> LightElements;

    public List<LightElement> getLightElements() {
        return LightElements;
    }

    public Lamp() {
        LightElements = new ArrayList<>();
    }

    public void addLightElement(LightElement lightElement) {
        this.LightElements.add(lightElement);
        System.out.println("Lightelement added");
    }

    public void turnAllOn() {
        for (LightElement lightElement : LightElements) {
            lightElement.turnOn();
        }
    }

    public void turnAllOff() {
        for (LightElement lightElement : LightElements) {
            lightElement.turnOff();
        }
    }

    public double getOverallPowerusage() {
        double powerusage = 0;
        for (LightElement lightElement : LightElements) {
            powerusage = powerusage + lightElement.getPowerusage();
        }
        System.out.println("The overall powerusage is " + powerusage + " W");
        return powerusage;
    }

    public void printNamesofLightElements() {
        String namesoflightelements = "Folgende Leuchtkörper sind verbaut:";
        for (LightElement lightElement : LightElements) {
            namesoflightelements = namesoflightelements + " " + lightElement.getName();
        }
        System.out.println(namesoflightelements);
    }
}
