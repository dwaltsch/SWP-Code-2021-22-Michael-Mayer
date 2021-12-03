package com.smortify.michael.projekte.oop.car2.car.manufacturer;

public class Manufacturer {
    private manufacturer manufacturer;

    public enum manufacturer {Gaudi,Bayrischer_Mistwagen,Mercesus,Saahb,Schevroleh,Fort,Volvo,Toyoda}
    private origincountry origincountry;
    public enum origincountry {Piefkeland,Amiland,Ikealand,Nuketown}
    private int manufacturerdiscount;

    public Manufacturer(Manufacturer.manufacturer manufacturer, Manufacturer.origincountry origincountry, int manufacturerdiscount) {
        this.manufacturer = manufacturer;
        this.origincountry = origincountry;
        this.manufacturerdiscount = manufacturerdiscount;
    }

    // se getta und se setta

    public Manufacturer.manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer.manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

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
}
