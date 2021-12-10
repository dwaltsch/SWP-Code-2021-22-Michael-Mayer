package com.smortify.michael.projekte.oop.cars.car.manufacturer;

public class Manufacturer {

    private manufacturer manufacturer;
    private origincountry origincountry;
    private int manufacturerdiscount;

    public Manufacturer(Manufacturer.manufacturer manufacturer, Manufacturer.origincountry origincountry, int manufacturerdiscount) {
        this.manufacturer = manufacturer;
        this.origincountry = origincountry;
        this.manufacturerdiscount = manufacturerdiscount;
    }

    public Manufacturer.manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer.manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

// se getta und se setta

    public Manufacturer.origincountry getOrigincountry() {
        return origincountry;
    }

    public void setOrigincountry(Manufacturer.origincountry origincountry) {
        this.origincountry = origincountry;
    }

    public int getManufacturerdiscount() {
        return manufacturerdiscount;
    }

    public void setManufacturerdiscount(int manufacturerdiscount) {
        this.manufacturerdiscount = manufacturerdiscount;
    }

    public enum manufacturer {Gaudi, Bayrischer_Mistwagen, Mercesus, Saahb, Schevroleh, Fort, Volvo, Toyoda}

    public enum origincountry {PIEFKELAND, Amiland, Ikealand, Nuketown}
}
